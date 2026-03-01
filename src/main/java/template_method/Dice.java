package template_method;

public class Dice extends Game{

    private int maxRounds;          // How many rounds we wants?
    private int currentRound;       // Which round we are in?
    private int numberOfPlayers;    // How many players are playing?
    private int[] scores;           // The scores of each player, we will update this array after each turn
    
    // We will implement the abstract methods from the Game class, we will use these methods to initialize the game, check if the game is over, play a single turn and display the winner of the game
    @Override
    public void initializeGame(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers; // Set the number of players, we will use this variable to determine how many players are playing and to update the scores array
        this.maxRounds = 5;                     // Set a fixed number of ow many rounds we wants? 
        this.currentRound = 0;                  // Set the current round to 0, we will update this variable after each round
        this.scores = new int[numberOfPlayers]; // Create an array to store the scores of each player, we will update this array after each turn
        System.out.println("Initializing Dice game for " + numberOfPlayers + " players.");
    }

    // The endOfGame method will check if the current round is greater than or equal to the max rounds, if it is, then the game is over and we will return true, otherwise we will return false
    @Override
    public boolean endOfGame() {
        System.out.println("Checking if the game is over: current round " + currentRound + " of " + maxRounds);
        return this.currentRound >= this.maxRounds;
    }

    @Override
    public void playSingleTurn(int player) {
        int roll = (int)(Math.random() * 6) + 1; // Simulate a dice roll (1-6)
        scores[player] += roll;
        
        System.out.println("Player " + player + " rolled a " + roll + ". Total score: " + scores[player]);

        if (player == numberOfPlayers - 1) { // If the current player is the last player, we will update the current round and print the end of the round message
            currentRound++;
            System.out.println("End of round " + currentRound);
        }
    }

    @Override
    public void displayWinner() {
        int winner = 0; // We will use this variable to store the index of the player with the highest score, we will update this variable after we check all the scores
        for (int i = 1; i < numberOfPlayers; i++) { // We will loop through the scores array and check if the current player's score is greater than the current winner's score, if it is, we will update the winner variable to the current player's index
            if (scores[i] > scores[winner]) {
                winner = i;
            }
        }
        System.out.println("Player " + winner + " wins with a score of " + scores[winner] + "!");
    }
}
