// 1. Mediator Interface  هذا يحدد شنو يگدر يسوي الوسيط

package mediator;

public interface Mediator {
    void registerUser(Controller user);
    void sendMessage(String sender, String from, String message);
}
