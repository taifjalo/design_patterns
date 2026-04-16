// 👤 3. User Class (MVC: Controller) هذا يمثل مستخدم واحد

package mediator;


import javafx.scene.control.*;


public class Controller {
    private final String username;
    private final Mediator mediator;
    private final TextArea chatArea;

    public Controller(String username, Mediator mediator, TextArea chatArea) {
        this.username = username;
        this.mediator = mediator;
        this.chatArea = chatArea;
        mediator.registerUser(this);
    }

    public String getUsername() {
        return username;
    }

    public void sendMessage(String recipient, String message) {
        chatArea.appendText("You to " + recipient + ": " + message + "\n");
        mediator.sendMessage(username, recipient, message);
    }

    public void receiveMessage(String sender, String message) {
        chatArea.appendText(sender + ": " + message + "\n");
    }
}