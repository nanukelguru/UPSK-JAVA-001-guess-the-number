import java.util.Random;

public class GuessTheNumber {
    //Declaring the Random Object
    public static Random rand = new Random();
    //Target variable to store the number that players must guess
    public static int targetNumber;
    public static String humanGuesses = "";
    public static String computerGuesses = "";

    //Main method, program entry point
    public static void main(String[] args) {
        targetNumber = rand.nextInt(100)+1;
        HumanPlayer human = new HumanPlayer();
        human.setName();

        while(true){

            int humanGuess = human.makeGuess();
            humanGuesses = humanGuesses + (humanGuess + " ");
            checkGuess(humanGuess, "Human");

            ComputerPlayer computer = new ComputerPlayer();
            int computerGuess = computer.makeGuess();
            computerGuesses = computerGuesses + (computerGuess + " ");

            checkGuess(computerGuess, "Computer");

            if(gameOver()){
                break;
            }
        }
        printResults();
    }

    public static boolean gameOver() {
        return humanGuesses.contains(Integer.toString(targetNumber)) ||
                computerGuesses.contains(Integer.toString(targetNumber));
    }

    public   static void checkGuess(int guess, String playerName){

        if(guess < targetNumber) {
            System.out.println(playerName + " guessed " + guess + ". Too low!");
        } else if(guess > targetNumber) {
            System.out.println(playerName + " guessed " + guess + ". Too high!");
        } else {
            System.out.println(playerName + " guessed " + guess + ". Correct!");
            System.out.println(playerName + " wins!");
        }
    }
    private static void printResults() {
        System.out.println("Target number was: " + targetNumber);
        System.out.println("Human's guesses: " + humanGuesses);
        System.out.println("Computer's guesses: " + computerGuesses);
    }
}
