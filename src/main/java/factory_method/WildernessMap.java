package factory_method;

import java.util.Random;

public class WildernessMap extends Map {
    private Random random = new Random();

    @Override
    public Tile createTile() {
        int num = random.nextInt(3);  //  Numberr from range 0 to 2.

        switch (num) {
            case 0:
                return new Water();
            case 1:
                return new Swamp();
            case 2:
                return new Forest();
            default:
                return new Swamp();
        }
    }
}