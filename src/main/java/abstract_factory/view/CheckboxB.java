package abstract_factory.view;
class CheckboxB extends Checkbox {
    private String text = "";

    @Override
    public void display() {
        System.out.println("(CheckboxB)");
        System.out.println("[ ] " + text);
        System.out.println("---------");
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
