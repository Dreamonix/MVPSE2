package de.whs.wi;

public class CounterModel implements ICounterModel {
    private int count = 0;

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void increment() {
        count++;
    }

    @Override
    public void reset() {
        count = 0;
    }
}
