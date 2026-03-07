package chain_of_responsibility;

public class CompensationClaimsHandler extends Handler {
    // This class will handle compensation claims messages. compensation claims can be reviewed and approved or rejected, and the handler will need to generate appropriate responses based on the content of the claim and the company's policies.

    @Override
    public void handleForm(Message message) {
        if (message.getType() == MessageType.COMPENSATION_CLAIM) {
            System.out.println("Handling compensation claim: " + message.getContent());
        } else {
            System.out.println("Compensation Claims Handler passing The Form to next handler.");
            super.handleForm(message);
        }
    }
}