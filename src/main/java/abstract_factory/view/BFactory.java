package abstract_factory.view;

public class BFactory extends UIFactory {
    @Override
    public Button createButton(String text) {
        return new ButtonB();
    }

    @Override
    public TextField createTextField(String text) {
        return new TextFieldB();
    }
    
    @Override
    public Checkbox createCheckbox(String text) {
        return new CheckboxB();
    }
}
