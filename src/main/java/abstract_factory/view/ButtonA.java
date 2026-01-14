package abstract_factory.view;
class ButtonA extends Button {
    private String text = "";

    @Override
    public void display() {
        System.out.println("  [ButtonA]  ");
        System.out.println(" " + text + " ");
        System.out.println(" ----------- ");
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
