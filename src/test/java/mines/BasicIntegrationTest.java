package mines;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JLabel;

public class BasicIntegrationTest {

    @Test
    void testBoardAndStatusIntegration() {
        JLabel statusbar = new JLabel();
        Board board = new Board(statusbar);

        // Test that board and statusbar work together
        assertTrue(board.isInGame());
        assertEquals("40", statusbar.getText());

        // Test game reset
        board.newGame();
        assertEquals("40", statusbar.getText());
    }
}