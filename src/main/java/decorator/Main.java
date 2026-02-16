package decorator;


public class Main {
    public static void main(String[] args) {
        // Create a basic printer
        Printer printer = new BasicPrinter();
        printer.print("Hello World!");

        // Decorate the printer with XML formatting and encryption and print the message again to see the effects of the decorators.
        Printer printer2 = new EncryptedPrinter(new XMLPrinter(new BasicPrinter()));
        printer2.print("Hello World!");
    }
}