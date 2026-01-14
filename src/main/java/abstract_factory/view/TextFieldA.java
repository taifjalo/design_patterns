package abstract_factory.view;
class TextFieldA extends TextField {
    private String text = "";

    @Override
    public void display() {
        System.out.println(" [TextFieldA] ");
        System.out.println(" " + text + " ");
        System.out.println(" ------------ ");
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
