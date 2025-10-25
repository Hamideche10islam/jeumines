package mines;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleMinesTest {

    @Test
    void testMinesFrameCreation() {
        // Test that we can create the game frame without errors
        assertDoesNotThrow(() -> {
            Mines mines = new Mines();
            assertNotNull(mines, "Mines frame should be created");
            assertEquals("Minesweeper", mines.getTitle(), "Should have correct title");
        });
    }

    @Test
    void testMainMethodRuns() {
        // Test that main method doesn't crash
        assertDoesNotThrow(() -> Mines.main(new String[]{}));
    }
}
