package factory_method;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Map map = new CityMap();
        map.display();
    }

    


    // Game Factory Method to create Map instances:
    public static Map createMap() {
        Random random = new Random();        // Implement logic to create either a CityMap or a WildernessMap

        int rand = random.nextInt(2); // Choose 0 or 1
        switch (rand) {
            case 0:
                return new CityMap();
            case 1:
                return new WildernessMap();
            default:
                throw new IllegalStateException("Unexpected value: " + rand);
        }
    }
}


