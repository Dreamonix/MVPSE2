package de.whs.wi;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CounterViewImpl extends Application implements ICounterView {
    private ICounterPresenter presenter;
    private Label counterLabel;

    @Override
    public void setPresenter(ICounterPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void updateCounter(int value) {
        if (counterLabel != null) {
            System.out.println("View: Updating counter label with value: " + value);
            counterLabel.setText("Counter: " + value);
        }
    }

    @Override
    public void show() {
        launch();
    }

    @Override
    public void init() {
        // No static wiring needed
    }

    @Override
    public void start(Stage primaryStage) {
        if (presenter == null) {
            throw new IllegalStateException("Presenter must be set before showing the view.");
        }

        counterLabel = new Label("Counter: 0");
        Button incrementButton = new Button("Increment");
        Button resetButton = new Button("Reset");

        incrementButton.setOnAction(e -> {
            System.out.println("View: Increment button clicked" + " - notifying presenter.");
            // Simulate a delay to show the asynchronous nature of the presenter
            try { Thread.sleep(2000); } catch (InterruptedException ex) { Thread.currentThread().interrupt(); }
            presenter.onIncrement();
        });
        resetButton.setOnAction(e -> {
            System.out.println("View: Reset button clicked" + " - notifying presenter.");
            // Simulate a delay to show the asynchronous nature of the presenter
            try { Thread.sleep(2000); } catch (InterruptedException ex) { Thread.currentThread().interrupt(); }
            presenter.onReset();
        });

        VBox root = new VBox(10, counterLabel, incrementButton, resetButton);
        root.setPadding(new Insets(20));
        Scene scene = new Scene(root, 250, 150);
        primaryStage.setTitle("MVP Counter Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
