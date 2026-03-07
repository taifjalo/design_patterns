package chain_of_responsibility;

public abstract class Handler {
    protected Handler nextHandler;


    // Set the next handler in the chain of responsibility
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // Handle the message and pass it to the next handler if necessary
    public void handleForm(Message message) {
        if (nextHandler != null) {
            nextHandler.handleForm(message);
        }
    }

}
