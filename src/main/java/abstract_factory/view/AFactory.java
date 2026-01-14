package abstract_factory.view;

public class AFactory extends UIFactory {
    @Override
    public Button createButton(String text) {
        return new ButtonA();
    }

    @Override
    public TextField createTextField(String text) {
        return new TextFieldA();
    }
    
    @Override
    public Checkbox createCheckbox(String text) {
        return new CheckboxA();
    }

}
