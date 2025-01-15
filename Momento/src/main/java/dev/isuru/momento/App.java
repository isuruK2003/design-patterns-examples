package dev.isuru.momento;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class App extends Application {
    private static TextArea textArea;
    private static Label statusLabel;

    private static MenuBar createMenuBar() {
        MenuBar menuBar = new MenuBar();

        // File Menu
        Menu fileMenu = new Menu("File");
        MenuItem save = new MenuItem("Save");
        save.setAccelerator(KeyCombination.keyCombination("Ctrl+S")); // Shortcut for Save
        save.setOnAction(e -> statusLabel.setText("Saved")); // Replace with your save logic
        MenuItem exit = new MenuItem("Exit");
        exit.setAccelerator(KeyCombination.keyCombination("Ctrl+Q")); // Shortcut for Exit
        exit.setOnAction(e -> System.exit(0));
        fileMenu.getItems().addAll(save, new SeparatorMenuItem(), exit);

        // Edit Menu
        Menu editMenu = new Menu("Edit");
        MenuItem undo = new MenuItem("Undo");
        undo.setAccelerator(KeyCombination.keyCombination("Ctrl+Z")); // Shortcut for Undo
        undo.setOnAction(e -> statusLabel.setText("Undo")); // Replace with your undo logic
        MenuItem redo = new MenuItem("Redo");
        redo.setAccelerator(KeyCombination.keyCombination("Ctrl+Y")); // Shortcut for Redo
        redo.setOnAction(e -> statusLabel.setText("Redo")); // Replace with your redo logic
        editMenu.getItems().addAll(undo, redo);

        menuBar.getMenus().addAll(fileMenu, editMenu);
        return menuBar;
    }

    private static HBox createStatusBar() {
        statusLabel = new Label("Ready");
        HBox statusBar = new HBox(statusLabel);
        statusBar.setPadding(new Insets(5));
        statusBar.setStyle("-fx-background-color: #f0f0f0;");
        return statusBar;
    }

    @Override
    public void start(Stage stage) {
        // Text Area
        textArea = new TextArea();
        textArea.setPromptText("Start typing here...");
        textArea.setWrapText(true);

        // Layout
        BorderPane root = new BorderPane();
        root.setTop(createMenuBar());
        root.setCenter(textArea);
        root.setBottom(createStatusBar());

        // Scene and Stage
        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Momento");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
