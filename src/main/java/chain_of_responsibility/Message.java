package chain_of_responsibility;

public class Message {
    private MessageType type;
    private String content;
    private String sender;


    public Message(MessageType type, String content, String sender) {
        this.type = type;
        this.content = content;
        this.sender = sender;
    }

    // Getters
    public MessageType getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }
}
