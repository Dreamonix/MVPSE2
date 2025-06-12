# Counter Application - Model-View-Presenter (MVP) Implementation

## Overview

This project demonstrates a simple counter application implemented using the Model-View-Presenter (MVP) architectural pattern in Java with JavaFX. The application allows users to increment a counter and reset it to zero through a simple graphical user interface.

## Project Structure

The project follows the Maven project structure and implements MVP through interfaces and concrete implementations:

```
ModelViewPresenter/
├── src/
│   └── main/
│       └── java/
│           └── de/
│               └── whs/
│                   └── wi/
│                       ├── AppBootstrapper.java   # Application bootstrapper
│                       ├── Main.java              # Entry point
│                       ├── CounterModel.java      # Model implementation
│                       ├── CounterPresenter.java  # Presenter implementation
│                       ├── CounterViewImpl.java   # View implementation
│                       ├── ICounterModel.java     # Model interface
│                       ├── ICounterPresenter.java # Presenter interface
│                       └── ICounterView.java      # View interface
```

## Model-View-Presenter Pattern

The MVP pattern used in this application separates the concerns of the application into three main components:

1. **Model**: Represents the data and business logic of the application
2. **View**: Represents the UI components and is responsible for displaying data to the user
3. **Presenter**: Acts as an intermediary between the Model and the View, handling user interactions and updating the View with data from the Model

The separation of concerns enables better testability, maintainability, and flexibility.

## Technology Stack

- Java 17
- JavaFX 21.0.1
- Maven 

## Running the Application

To run the application, use Maven with the JavaFX plugin:

```
mvn javafx:run
```

Alternatively, you can execute the `Main` class directly from your IDE.

## Components Documentation

Detailed documentation for each component can be found in the following files:

- [Model Documentation](./docs/model.md)
- [View Documentation](./docs/view.md)
- [Presenter Documentation](./docs/presenter.md)
- [Architecture Overview](./docs/architecture.md)
