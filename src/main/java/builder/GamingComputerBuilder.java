package builder;

public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;


    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.addComponent(new ComputerComponent("High-End Gaming Processor"));
    }

    @Override
    public void buildRAM() {
        computer.addComponent(new ComputerComponent("32GB Gaming RAM"));
    }

    @Override
    public void buildHardDrive() {
        computer.addComponent(new ComputerComponent("1TB Gaming SSD"));
    }

    @Override
    public void buildGraphicsCard() {
        computer.addComponent(new ComputerComponent("RTX 4090 Gaming Graphics Card"));
    }

    @Override
    public void buildOperatingSystem() {
        computer.addComponent(new ComputerComponent("Windows 11 Pro"));
    }

    // Return the constructed or built computer. from all methods calls computer instance.
    @Override
    public Computer getComputer() {
        return this.computer;
    }
}