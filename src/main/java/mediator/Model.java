// 2. Concrete Mediator (MVC: Model or Logic) هذا قلب النظام

package mediator;

import java.util.HashMap;
import java.util.Map;

// very similar to controller in MVC
public class Model implements Mediator {
    private final Map<String, Controller> clients = new HashMap<>();

    @Override
    public void registerUser(Controller client) {
        clients.put(client.getUsername(), client);
    }

    @Override
    public void sendMessage(String sender, String recipient, String message) {
        if (clients.containsKey(recipient)) {
            clients.get(recipient).receiveMessage(sender, message);
        }
    }
}
