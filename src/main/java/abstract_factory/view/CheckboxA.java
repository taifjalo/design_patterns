package abstract_factory.view;
class CheckboxA extends Checkbox {
    private String text = "";

    @Override
    public void display() {
        System.out.println("[CheckboxA]");
        System.out.println("[ ] " + text);
        System.out.println("---------");
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
