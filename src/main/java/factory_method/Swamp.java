package factory_method;

public class Swamp implements Tile {
    
    @Override
    public char getCharacter() {
        return 'S';
    }
    
    @Override
    public String getType() {
        return "Swamp";
    }
}
