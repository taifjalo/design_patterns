package chain_of_responsibility;

public class ContactRequestsHandler extends Handler {
    // This class will handle contact request messages. contact requests can be inquiries about how to get in touch with customer support, requests for callback, or other types of communication requests. The handler will need to provide appropriate responses based on the content of the request and the company's communication policies.

    @Override
    public void handleForm(Message message) {
        if (message.getType() == MessageType.CONTACT_REQUEST) {
            System.out.println("Handling contact request: " + message.getContent());
        } else {
            System.out.println("Contact Requests Handler passing The Form to next handler.");
            super.handleForm(message);
        }
    }
    
}
