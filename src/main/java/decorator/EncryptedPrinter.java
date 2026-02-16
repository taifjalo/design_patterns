package decorator;

public class EncryptedPrinter extends PrinterDecorator {

    // Constructor that takes a Printer object to decorate and passes it to the superclass constructor, allowing for chaining of decorators.
    public EncryptedPrinter(Printer printer) {
        super(printer);
    }


    // Override the print method to add encryption 
    @Override
    public void print(String message) {
        String encryptedMessage = encrypt(message);
        printer.print(encryptedMessage);
        System.out.println("Encrypted: " + encryptedMessage);
    }



    // Simple encryption method (Caesar cipher with a shift of 3)
    private String encrypt(String message) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            encrypted.append((char) (c + 3)); // Simple Caesar cipher shifting by 3
        }
        return encrypted.toString();
    }
    
}
