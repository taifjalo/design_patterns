package state;


public class Expert extends State {

    private GameCharacter character;

    public Expert(GameCharacter gameCharacter) {
        super(gameCharacter);
        this.character = gameCharacter;
    }

    @Override
    void train() {
        // Increase experience points by 10
        character.setExperiencePoints(character.getExperiencePoints() + 10);

        if (character.getExperiencePoints() >= 300) {
            character.setLevel(new Master(character));
            
            System.out.println("Congratulations. You are now a Master.");
            return; // Exit the method to prevent further training actions
        }
        
        System.out.println("Expert is training.");
        System.out.println("Your Experience Points is now " + character.getExperiencePoints());
    }

    @Override
    void meditate() {
        // Increase health points by 10
        character.setHealthPoints(character.getHealthPoints() + 10);

        System.out.println("Expert is meditating.");
        System.out.println("Your Health Points is now " + character.getHealthPoints());
    }

    @Override
    void fight() {
        // Increase experience points by 10 at fight
        character.setExperiencePoints(character.getExperiencePoints() + 10);
        // Decrease health points by 15 at fight
        character.setHealthPoints(character.getHealthPoints() - 10);

        
        

        if (character.getHealthPoints() <= 0) {
            System.out.println("You have been defeated.");
        }

        System.out.println("Expert is fighting.");
        System.out.println("Your Health Points is now " + character.getHealthPoints());
        System.out.println("Your Experience Points is now " + character.getExperiencePoints());
    }
}
