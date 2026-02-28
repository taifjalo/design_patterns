package state;

public class Main {
    public static void main(String[] args) {

        GameCharacter character = new GameCharacter("John", 100, 0);
        // Train, meditate, and fight until the character reaches the Master level
        while (!(character.getLevel() instanceof Master)) {
                character.train();
                character.meditate();
                character.fight();
        }
        System.out.println("Your stats" + character.toString());
    }
}
