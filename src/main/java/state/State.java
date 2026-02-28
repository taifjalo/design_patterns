package state;

public abstract class State {

    private GameCharacter character;
    
    public State(GameCharacter gamecharacter) {
        this.character = gamecharacter;
    }

    public GameCharacter getCharacter() {
        return character;
    }

    abstract void train();
    abstract void meditate();
    abstract void fight();

}
