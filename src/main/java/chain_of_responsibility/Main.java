package chain_of_responsibility;

public class Main {
    public static void main(String[] args) {

        // Concrete Handlers: Create handlers 
        Handler compensationHandler = new CompensationClaimsHandler();
        Handler contactRequestHandler = new ContactRequestsHandler();
        Handler developmentSuggestionHandler = new DevelopmentSuggestionsHandler();
        Handler generalFeedbackHandler = new GeneralFeedbackHandler();


        // Chain of Responsibility: Set up the chain of handlers through the nextHandler references
        compensationHandler.setNextHandler(contactRequestHandler);
        contactRequestHandler.setNextHandler(developmentSuggestionHandler);
        developmentSuggestionHandler.setNextHandler(generalFeedbackHandler);

        // The Message class represent the request or feedback that needs to be processed. Each message has a type, content, and sender information. The handlers will use the type of the message to determine if they can process it or if they should pass it to the next handler in the chain.
        // Create messages
        Message msg1 = new Message(
                MessageType.COMPENSATION_CLAIM,
                "Flight delay refund request",
                "user1@mail.com"
        );

        Message msg2 = new Message(
                MessageType.CONTACT_REQUEST, 
                "I want to contact customer support.", 
                "user2@email.com"
        );

        Message msg3 = new Message(
                MessageType.DEVELOPMENT_SUGGESTION, 
                "I have a suggestion for improving the product.", 
                "user3@email.com"
        );
        Message msg4 = new Message(
                MessageType.GENERAL_FEEDBACK, 
                "I have some feedback about the service.", 
                "user4@email.com"
        );
        

        // Process messages
        System.out.println("Processing feedback: ");
        System.out.println("--------------------");
        compensationHandler.handleForm(msg1);

        System.out.println("--------------------");
        compensationHandler.handleForm(msg2);

        System.out.println("--------------------");
        compensationHandler.handleForm(msg3);

        System.out.println("--------------------");
        compensationHandler.handleForm(msg4);
    }
}