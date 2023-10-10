import java.util.Scanner;

public class HumanPlayer extends Player {
    public HumanPlayer() {
        super();
    }

    @Override
    public int makeGuess() {
        System.out.println(name + ", make a guess: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    void setName() {
        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
    }


}
