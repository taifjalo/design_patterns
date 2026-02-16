package decorator;

public abstract class PrinterDecorator implements Printer {

    // Reference to the object being decorated
    protected Printer printer;

    // Constructor to set the decorated printer
    public PrinterDecorator(Printer decoratedPrinter) {
        this.printer = decoratedPrinter;
    }
}
