import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberTest {
    @Test
    void testGameOverWhenHumanAsserts(){
        // Simulate a game where the target number is in the attempts of the human player.
        GuessTheNumber.humanGuesses = "42 24 10 78 65 5";
        GuessTheNumber.computerGuesses = "30 75 49 53 88 12";
        GuessTheNumber.targetNumber = 10; // Target number that is in the attempts of the human player.

        // Verify that the game is considered "game over" when the target number is in the attempts.
        assertTrue(GuessTheNumber.gameOver());
    }

}