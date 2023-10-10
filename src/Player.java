import java.util.ArrayList;
import java.util.Scanner;

public abstract class Player {
    protected String name;
    ArrayList<Integer> guesses = new ArrayList<>();

    //Constructor para inicializar el nombre y las suposiciones del jugador
    public Player(String name){
        this.name = name;
        this.guesses = new ArrayList<>();
    }

    public Player() {
        name = "";
    }

    public int makeGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + "enter your guess");
        int guess = scanner.nextInt();
        guesses.add(guess);
        return guess;
    }
    public String getName(){
        return name;
    }

    public ArrayList<Integer> getGuesses() {
        return guesses;
    }
}
