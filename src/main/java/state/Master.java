package state;

public class Master extends State {

    public Master(GameCharacter gameCharacter) {
    super(gameCharacter);
}

    // The Final State Method:
    @Override
    public void train() {  
        System.out.println("You are done now ");
    }

    @Override
    public void meditate() {
        
    }

    @Override
    public void fight() {    

    }
}
