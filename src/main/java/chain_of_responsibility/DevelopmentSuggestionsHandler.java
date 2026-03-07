package chain_of_responsibility;

public class DevelopmentSuggestionsHandler extends Handler {
    
    @Override
    public void handleForm(Message message) {
        if (message.getType() == MessageType.DEVELOPMENT_SUGGESTION) {
            System.out.println("Handling development suggestion: " + message.getContent());
        } else {
            System.out.println("Development Suggestions Handler passing The Form to next handler.");
            super.handleForm(message);
        }
    }
}
