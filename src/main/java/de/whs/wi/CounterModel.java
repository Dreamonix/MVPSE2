package de.whs.wi;

public class CounterModel implements ICounterModel {
    private int count = 0;

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void increment() {
        System.out.println("Model: Got increment request from presenter, incrementing count.");
        try { Thread.sleep(2000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        count++;
    }

    @Override
    public void reset() {

        System.out.println("Model: Got reset request from presenter, resetting count.");
        try { Thread.sleep(2000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        count = 0;
    }
}
