import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerPlayerTest {
    @Test
    public void testMakeGuessInRange() {
        ComputerPlayer computerPlayer = new ComputerPlayer();
        int guess = computerPlayer.makeGuess();
        assertTrue(guess >= 1 && guess <= 100);
    }
}