package decorator;

public abstract class PrinterDecorator implements Printer {

    // Reference to the object being decorated
    protected Printer decoratedPrinter;

    // Constructor to set the decorated printer
    public PrinterDecorator(Printer decoratedPrinter) {
        this.decoratedPrinter = decoratedPrinter;
    }
}
