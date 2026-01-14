package abstract_factory;

import abstract_factory.view.AFactory;
import abstract_factory.view.BFactory;
import abstract_factory.view.Button;
import abstract_factory.view.Checkbox;
import abstract_factory.view.TextField;
import abstract_factory.view.UIFactory;

public class Main {
    public static void main(String[] args) {
        // Create a UIFactory of Style A
        UIFactory factoryA = new AFactory();

        // Or Create a UIFactory of Style B. not used yet.
        UIFactory factoryB = new BFactory(); 

        // Create UI Elements using Style A
        Button buttonA = factoryA.createButton("Click me");
        TextField textFieldA = factoryA.createTextField("Enter text");
        Checkbox checkboxA = factoryA.createCheckbox("Agree");

        // Display UI Elements
        buttonA.display();
        textFieldA.display();
        checkboxA.display();

        // Step 7: Finally Change content dynamically
        buttonA.setText("New Text");
        buttonA.display();

    }
}