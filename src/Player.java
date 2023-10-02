import java.util.ArrayList;
import java.util.Scanner;

public abstract class Player {
    private final String name;
    private final ArrayList<Integer> guesses;

    //Constructor para inicializar el nombre y las suposiciones del jugador
    public Player(String name){
        this.name = name;
        this.guesses = new ArrayList<>();
    }
    public int makeGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + "enter your guess");
        int guess = scanner.nextInt();
        guesses.add(guess);
        return guess;
    }
    public String ToString(){
        return name;
    }

    public ArrayList<Integer> getGuesses() {
        return guesses;
    }
}
