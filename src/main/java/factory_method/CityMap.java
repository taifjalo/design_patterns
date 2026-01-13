package factory_method;

import java.util.Random;

public class CityMap extends Map {
    private Random random = new Random();       // Random Numbers Class.

    @Override
    public Tile createTile () {
        int num = random.nextInt(3); //  Numberr from range 0 to 2.
        
        switch (num) {
            case 0:
                return new Forest();
            case 1:
                return new Road();
            case 2:
                return new Building();
            default:
                return new Road();
        }
    }
}
