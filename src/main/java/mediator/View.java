// ChatApp class (MVC: View) to demonstrate the Mediator pattern واجهة المستخدم (JavaFX)

package mediator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class View extends Application {
    private static final Mediator mediator = new Model();

    @Override
    public void start(Stage primaryStage) {
        launchChatWindow("Alice", 100, 100);
        launchChatWindow("Bob", 600, 200);
        launchChatWindow("Charlie", 1100, 100);
    }

    private void launchChatWindow(String username, double x, double y) {
        Stage stage = new Stage();
        stage.setTitle("Chat - " + username);
        stage.setX(x);
        stage.setY(y);

        TextArea chatArea = new TextArea();
        chatArea.setEditable(false);
        chatArea.setPrefHeight(300);

        TextField messageField = new TextField();
        ComboBox<String> recipientBox = new ComboBox<>();
        recipientBox.getItems().addAll("Alice", "Bob", "Charlie");
        recipientBox.setValue("Alice");

        Controller user = new Controller(username, mediator, chatArea);

        Button sendButton = new Button("Send");
        sendButton.setOnAction(e -> {
            String recipient = recipientBox.getValue();
            String message = messageField.getText();
            if (!message.isEmpty() && !recipient.equals(username)) {
                user.sendMessage(recipient, message);
                messageField.clear();
            }
        });

        VBox layout = new VBox(10, chatArea, recipientBox, messageField, sendButton);
        layout.setPadding(new Insets(10));
        Scene scene = new Scene(layout, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}
