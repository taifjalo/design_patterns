package chain_of_responsibility;

public class GeneralFeedbackHandler extends Handler {
    
    @Override
    public void handleForm(Message message) {
        if (message.getType() == MessageType.GENERAL_FEEDBACK) {
            System.out.println("Handling General Feedback: " + message.getContent());
        } else {
            System.out.println("General Feedback Handler passing The Form to next handler.");
            super.handleForm(message);
        }
    }
}