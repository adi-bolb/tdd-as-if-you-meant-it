import org.junit.Test;
import tictactoe.Board;

import static junit.framework.TestCase.assertEquals;

public class BoardTests {

    @Test
    public void canBuildBoardWithCorrectBoardStructure(){
        String boardStructure = "correct board structure";
        Board board = new Board(boardStructure);

        String actual = board.getStructure();

        assertEquals(boardStructure, actual);
    }
}
