package de.whs.wi;

public interface ICounterView {
    void setPresenter(ICounterPresenter presenter);
    void updateCounter(int value);
    void show();
}
