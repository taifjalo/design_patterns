// 2. Concrete Mediator (MVC: Model or Logic) هذا قلب النظام

package mediator;

import java.util.HashMap;
import java.util.Map;

// very similar to controller in MVC
public class Model implements Mediator {
    private final Map<String, Controller> users = new HashMap<>();

    @Override
    public void registerUser(Controller user) {
        users.put(user.getUsername(), user);
    }

    @Override
    public void sendMessage(String sender, String recipient, String message) {
        if (users.containsKey(recipient)) {
            users.get(recipient).receiveMessage(sender, message);
        }
    }
}
