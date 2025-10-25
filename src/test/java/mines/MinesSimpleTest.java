package mines;

import org.junit.jupiter.api.Test;
import javax.swing.JLabel;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Simple tests for Mines and Board classes.
 */
public class MinesSimpleTest {

    @Test
    void testMinesWindowCreation() {
        // Test that the Mines window initializes correctly
        Mines mines = new Mines();
        assertNotNull(mines, "Mines window should be created");
        assertEquals("Minesweeper", mines.getTitle(), "Window title should be 'Minesweeper'");
        mines.dispose(); // Close the window after test
    }

    @Test
    void testBoardStartsInGame() {
        JLabel label = new JLabel();
        Board board = new Board(label);
        assertTrue(board.isInGame(), "Game should start in active state");
    }

    @Test
    void testBoardHasCorrectSize() {
        JLabel label = new JLabel();
        Board board = new Board(label);
        assertEquals(16, board.getRows(), "Board should have 16 rows");
        assertEquals(16, board.getCols(), "Board should have 16 columns");
    }

    @Test
    void testMineCounterIs40AtStart() {
        JLabel label = new JLabel();
        Board board = new Board(label);
        assertEquals(40, board.getMinesLeft(), "There should be 40 mines at the start");
    }

    @Test
    void testNewGameResetsMinesLeft() {
        JLabel label = new JLabel();
        Board board = new Board(label);
        board.newGame();
        assertEquals(40, board.getMinesLeft(), "After restarting, mines left should reset to 40");
    }
}
