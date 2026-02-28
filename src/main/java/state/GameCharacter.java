package state;

public class GameCharacter {

    private String name;
    private State level;  // Represents the current state of the character (Novice, Intermediate, Expert)
    private int exp = 0; // experiencePoints
    private int hp;  // healthPoints

    
    // Constructor to initialize the game character with default values and set the initial state to Novice.
    public GameCharacter(String name, int experiencePoints, int healthPoints) {
        this.name = name;
        this.level = new Novice(this);
        this.exp = experiencePoints;
        this.hp = healthPoints;
    }


    // Getters and Setters
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public State getLevel() {
        return level;
    }


    public void setLevel(State state) {
        this.level = state;
    }


    public int getExperiencePoints() {
        return exp;
    }


    public void setExperiencePoints(int ExperiencePoints) {
        this.exp = ExperiencePoints;
    }


    public int getHealthPoints() {
        return hp;
    }


    public void setHealthPoints(int healthPoints) {
        this.hp = healthPoints;
    }
    
    // Print All Details:
    @Override
    public String toString(){
        return "Name: "  + name + "\nHealth Points: "+ hp + "\nExperience Points: "+ exp;
    }


    // Main Methods to set State from State.java class:
    public void train() {
        level.train();
    }
    public void meditate() {
        level.meditate();
    }
    public void fight() {
        level.fight();
    }
    
}
