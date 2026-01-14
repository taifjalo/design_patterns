package abstract_factory.view;
class ButtonB extends Button {
    private String text = "";

    @Override
    public void display() {
        System.out.println("  (ButtonB)  ");
        System.out.println(" " + text + " ");
        System.out.println(" ----------- ");
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
