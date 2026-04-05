package builder;

public class ComputerDirector {

    // The ComputerDirector class is responsible for constructing a computer using a specific ComputerBuilder implementation. It defines the steps to build a computer by calling the appropriate methods on the builder instance.
    private ComputerBuilder builder;

    // Constructor to initialize the ComputerDirector with a specific ComputerBuilder implementation.
    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    // The constructComputer method defines the steps to build a computer by calling the appropriate methods on the builder instance. It ensures that all necessary components are built in the correct order.
    public void constructComputer() {
        builder.buildProcessor();
        builder.buildRAM();
        builder.buildHardDrive();
        builder.buildGraphicsCard();
        builder.buildOperatingSystem();
    }
    
}
