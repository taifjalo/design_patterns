package builder;

public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.addComponent(new ComputerComponent("Standard Office Processor"));
    }

    @Override
    public void buildRAM() {
        computer.addComponent(new ComputerComponent("16GB Office RAM"));
    }

    @Override
    public void buildHardDrive() {
        computer.addComponent(new ComputerComponent("512GB Office SSD"));
    }

    @Override
    public void buildGraphicsCard() {
        computer.addComponent(new ComputerComponent("Integrated Graphics Card"));
    }

    @Override
    public void buildOperatingSystem() {
        computer.addComponent(new ComputerComponent("Windows 11 Home"));
    }

    // Return the constructed or built computer. from all methods calls computer instance.
    @Override
    public Computer getComputer() {
        return this.computer;
    }
}