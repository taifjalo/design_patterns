package builder;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    
    List<ComputerComponent> components;

    public Computer() {
        this.components = new ArrayList<>();
    }

    public void addComponent(ComputerComponent component) {
        components.add(component);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computer Components:\n");
        for (ComputerComponent component : components) {
            sb.append("- ").append(component.getName()).append("\n");
        }
        return sb.toString();
    }
}
