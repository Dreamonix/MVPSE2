package de.whs.wi;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppBootstrapper extends Application {
    @Override
    public void start(Stage primaryStage) {
        CounterViewImpl view = new CounterViewImpl();
        ICounterModel model = new CounterModel();
        ICounterPresenter presenter = new CounterPresenter(model, view);
        view.setPresenter(presenter);
        view.start(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
