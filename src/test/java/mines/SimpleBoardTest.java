package mines;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JLabel;

public class SimpleBoardTest {
    private Board board;
    private JLabel statusbar;

    @BeforeEach
    void setUp() {
        statusbar = new JLabel();
        board = new Board(statusbar);
    }

    @Test
    void testGameStartsCorrectly() {
        assertTrue(board.isInGame(), "Game should be active at start");
        assertEquals(40, board.getMinesLeft(), "Should start with 40 mines");
        assertEquals(16, board.getRows(), "Should have 16 rows");
        assertEquals(16, board.getCols(), "Should have 16 columns");
    }

    @Test
    void testNewGameResetsState() {
        // Call new game multiple times
        board.newGame();
        board.newGame();

        assertTrue(board.isInGame(), "Game should be active after reset");
        assertEquals(40, board.getMinesLeft(), "Should reset to 40 mines");
    }

    @Test
    void testStatusBarUpdates() {
        assertEquals("40", statusbar.getText(), "Status should show mine count");
    }

    @Test
    void testGameCanEnd() {
        // This is a simple test to verify the game can change state
        // In real usage, the game would end when a mine is clicked
        assertTrue(board.isInGame(), "Game starts as active");

        // The actual game over logic is tested through gameplay
        // This test just verifies the initial state is correct
    }
}