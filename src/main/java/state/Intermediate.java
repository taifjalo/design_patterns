package state;

public class Intermediate extends State {

    private GameCharacter character;

    public Intermediate(GameCharacter gameCharacter) {
        super(gameCharacter);
        this.character = gameCharacter;
    }

    @Override
    void train() {
        // Increase experience points by 20
        character.setExperiencePoints(character.getExperiencePoints() + 10);

        System.out.println("Intermediate is training.");
        System.out.println("Your Experience Points is now " + character.getExperiencePoints());
    }

    @Override
    void meditate() {
        // Increase health points by 10
        character.setHealthPoints(character.getHealthPoints() + 10);

        // Check if health points have reached 200 to transition to Expert state
        if (character.getHealthPoints() >= 100) {
            character.setLevel(new Expert(character));
        }

        System.out.println("Intermediate is meditating.");
        System.out.println("Your Health Points is now " + character.getHealthPoints());
    }

    @Override
    void fight() {
        System.out.println("At Intermediate no fighting.");
    }
}
