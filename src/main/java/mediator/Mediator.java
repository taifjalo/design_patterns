// 1. Mediator Interface  هذا يحدد شنو يگدر يسوي الوسيط

package mediator;

public interface Mediator {
    void registerClient(Controller client);
    void sendMessage(String sender, String from, String message);
}
