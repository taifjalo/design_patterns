package proxy;
import java.util.HashMap;

public class AccesControlService {
    private static AccesControlService instance;
    private static HashMap<String, String> allowedUsers = new HashMap<>();

    private AccesControlService() {
    }

    public static AccesControlService getInstance() {
        if (instance == null) {
            instance = new AccesControlService();
        }
        return instance;
    }


    public Boolean checkAuthorization(String documentName, String username) {
        if (allowedUsers.containsKey(documentName)) {
            return allowedUsers.get(documentName).equals(username);
        }
        return false;
    }


    public void grantAccess(String documentName, User user) {
        allowedUsers.put(documentName, user.getName());
    }
}