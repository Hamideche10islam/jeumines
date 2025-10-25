package mines;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleTest {

    @Test
    public void testBoardCreation() {
        Board board = new Board(new javax.swing.JLabel());
        assertTrue(board.isInGame());
        assertEquals(40, board.getMinesLeft());
    }

    @Test
    public void testMinesFrame() {
        assertDoesNotThrow(() -> new Mines());
    }

    @Test
    public void testNewGame() {
        Board board = new Board(new javax.swing.JLabel());
        board.newGame();
        assertTrue(board.isInGame());
    }
}