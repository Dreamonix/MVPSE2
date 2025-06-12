# Model Documentation

## Overview

The Model component in this MVP implementation represents the data and business logic of the application. It maintains the counter's state and provides methods to manipulate this state.

## Components

### ICounterModel Interface

`ICounterModel` defines the contract for the counter model with the following methods:

```java
public interface ICounterModel {
    int getCount();    // Returns the current counter value
    void increment();  // Increments the counter by 1
    void reset();      // Resets the counter to 0
}
```

### CounterModel Implementation

`CounterModel` is the concrete implementation of the `ICounterModel` interface:

```java
public class CounterModel implements ICounterModel {
    private int count = 0;  // Internal state representing the counter value

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
```

## Responsibilities

The Model is responsible for:

1. **Data Storage**: Maintaining the counter value.
2. **Business Logic**: Providing methods to increment and reset the counter.
3. **State Management**: Managing the state of the application data.

## Design Considerations

- The Model is completely independent of the View and Presenter. It has no knowledge of how or where its data will be displayed.
- The Model provides a clean API through the `ICounterModel` interface, making it easy to swap implementations.
- The Model is stateful, maintaining the counter value as an internal variable.
- The implementation is simple but could be extended to include additional features such as:
  - Decrementing the counter
  - Setting a specific counter value
  - Adding validation rules (e.g., preventing negative values)
  - Persistence of counter state

## Testing

The Model is designed to be easily testable due to its isolated nature. Tests should cover:

1. Initial state (counter starts at 0)
2. Increment functionality
3. Reset functionality
4. Any boundary conditions or constraints that may be added in the future
