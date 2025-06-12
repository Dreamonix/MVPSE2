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
        model.increment();
        updateView();
    }

    @Override
    public void onReset() {
        model.reset();
        updateView();
    }

    private void updateView() {
        if (view != null) {
            view.updateCounter(model.getCount());
        }
    }
}
