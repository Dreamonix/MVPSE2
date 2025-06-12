package de.whs.wi;

public class CounterPresenter implements ICounterPresenter {
    private final ICounterModel model;
    private final ICounterView view;

    public CounterPresenter(ICounterModel model, ICounterView view) {
        this.model = model;
        this.view = view;
        this.view.setPresenter(this);
        updateView();
    }

    @Override
    public void onIncrement() {
        System.out.println("Presenter: Increment button was clicked now updating model." + model.getCount());
        try { Thread.sleep(2000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        model.increment();
        System.out.println("Presenter: Model was updated, updating view." + model.getCount());
        try { Thread.sleep(2000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        updateView();
    }

    @Override
    public void onReset() {
        System.out.println("Presenter: Reset button was clicked now resetting model." + model.getCount());
        try { Thread.sleep(2000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        model.reset();
        System.out.println("Presenter: Model was reset, updating view." + model.getCount());
        try { Thread.sleep(2000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        updateView();
    }

    private void updateView() {
        if (view != null) {
            view.updateCounter(model.getCount());
        }
    }
}
