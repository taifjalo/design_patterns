package command;

public class Controller {
    private Command moveCursorUp;
    private Command moveCursorDown;
    private Command moveCursorLeft;
    private Command moveCursorRight;
    private Command togglePixel;
    private Command generateCode;

    public Controller(Command moveCursorUp, Command moveCursorDown, Command moveCursorLeft, Command moveCursorRight, Command togglePixel, Command generateCode) {
        this.moveCursorUp = moveCursorUp;
        this.moveCursorDown = moveCursorDown;
        this.moveCursorLeft = moveCursorLeft;
        this.moveCursorRight = moveCursorRight;
        this.togglePixel = togglePixel;
        this.generateCode = generateCode;
    }

    public void moveUp() {
        moveCursorUp.execute();
    }

    public void moveDown() {
        moveCursorDown.execute();
    }

    public void moveLeft() {
        moveCursorLeft.execute();
    }

    public void moveRight() {
        moveCursorRight.execute();
    }

    public void togglePixel() {
        togglePixel.execute();
    }

    public void generateCode() {
        generateCode.execute();
    }
}
