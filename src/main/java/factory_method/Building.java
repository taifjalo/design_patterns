package factory_method;

public class Building implements Tile {

    @Override
    public char getCharacter() {
        return 'B';
    }

    @Override
    public String getType() {
        return "Building";
    }
}
