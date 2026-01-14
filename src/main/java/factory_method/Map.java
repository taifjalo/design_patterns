package factory_method;



public abstract class Map {

    public abstract Tile createTile(); // the factory method: used for two porbice first to defines what should be created, but not how, A hook method that subclasses override to control object creation. then we display() this data but callin it again inside the display() method. 

    // Method will be shared in Main Class by all Map Classes to display the map tiles implementaions.
    public void display () {
        for (int i = 0; i < 5; i++) { 
            for (int j = 0; j < 5; j++) {


                // The Magic Method display() is common behavior 
                Tile makeTile = createTile(); // IMPORTMEN LOGIC : we are calling the function which implemented in in Tile inter face subclasses. so we get the data from there, then we call it here agian with display function to display all the data which comes from that interface and their subclass. so this method used towice. here and there
                char tile = makeTile.getCharacter();
                // String tile = makeTile.getType();

                System.out.print( " " + tile + " ");
            }
            System.out.println(); // print next line
        }
    }
  
}