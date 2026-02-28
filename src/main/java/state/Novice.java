package state;

public class Novice extends State {

    private GameCharacter character;

    public Novice(GameCharacter gameCharacter) {
        super(gameCharacter);
        this.character = gameCharacter;
    }

    @Override
    void train() {
        character.setExperiencePoints(character.getExperiencePoints() + 10);

        if (character.getExperiencePoints() >= 50) {
            character.setLevel(new Intermediate(character));
        }

        System.out.println("Novice is training.");
        System.out.println("Your Experience Points is now " + character.getExperiencePoints());
    }

    @Override
    void meditate() {
        System.out.println("At Novice Level no meditating.");
    }

    @Override
    void fight() {
        System.out.println("At Novice Level no fighting.");
    }
    
}
