import java.util.Random;

public class GuessTheNumber {
    //Declaración del objeto Random
    public static Random rand = new Random();
    //Variable target para almacenar el numero que los jugadores deben adivinar
    private static int targetNumber;
    private static String guesses;

    //Método main , punto de entrada del programa
    public static void main(String[] args) {

        targetNumber = rand.nextInt(100)+1;
        while(true){
            HumanPlayer human = new HumanPlayer("Human");
            checkGuess(human);

            ComputerPlayer computer = new ComputerPlayer("Robot");
            checkGuess(computer);

            if(gameOver()){
                break;
            }

        }
       
        printResults();
    }

    private static boolean gameOver() {
        Object human = new Object();
        Object computer = new Object();

        if (!human.guesses.contains(targetNumber)) if (computer.guesses.contains(targetNumber)) {
            return true;
        }
        else {
            return true;
        }
        return false;
    }

    private  static void checkGuess(Player player){
        int guess = player.makeGuess();
        if(guess < targetNumber) {
            System.out.println(player + " guessed " + guess + ". Too low!");
        } else if(guess > targetNumber) {
            System.out.println(player + " guessed " + guess + ". Too high!");
        } else {
            System.out.println(player + " guessed " + guess + ". Correct!");
            System.out.println(player + " wins!");
        }
    }

    private static void printResults() {
        System.out.println("Target number was: " + targetNumber);
        System.out.println("Human's guesses: " + human.guesses);
        System.out.println("Computer's guesses: " + computer.guesses);
    }

}
