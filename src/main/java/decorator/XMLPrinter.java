package decorator;

public class XMLPrinter extends PrinterDecorator {

    // Constructor that takes a Printer object to decorate and passes it to the superclass constructor, allowing for chaining of decorators.
    public XMLPrinter(Printer printer) {
        super(printer);
    }

    
    // Override the print method to add XML formatting
    @Override
    public void print(String text) {
        String xmlMessage = "<message>" + text + "</message>";
        decoratedPrinter.print(xmlMessage);
        System.out.println("XML: " + xmlMessage);
    }
}

    