import java.util.Random;

public class GuessTheNumber {
    //Declaración del objeto Random
    public static Random rand = new Random();
    //Variable target para almacenar el numero que los jugadores deben adivinar
    private static int targetNumber;
    private static String humanGuesses = "";
    private static String computerGuesses = "";
    private static Player player;

    //Método main , punto de entrada del programa
    public static void main(String[] args) {
        targetNumber = rand.nextInt(100)+1;
        HumanPlayer human = new HumanPlayer();
        human.setName();

        while(true){

            int humanGuess = human.makeGuess();
            humanGuesses += humanGuess + " ";
            checkGuess(humanGuess, "Human");

            ComputerPlayer computer = new ComputerPlayer();
            int computerGuess = computer.makeGuess();
            computerGuesses += computerGuess + " ";

            checkGuess(computerGuess, "Computer");

            if(gameOver()){
                break;
            }

        }
       
        printResults();
    }

    private static boolean gameOver() {
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
