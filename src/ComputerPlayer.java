public class ComputerPlayer extends Player {

    public ComputerPlayer() {
    super();
    }

    @Override
    public int makeGuess() {
        return (int)(Math.random()*100+1);
    }
}

