import org.junit.Test;
import tictactoe.Board;
import tictactoe.BoardBuilder;

import static junit.framework.TestCase.assertEquals;

public class BoardTests {

    @Test
    public void canBuildBoardWithCorrectBoardStructure(){
        String boardStructure = "correct board structure";
        Board board = new BoardBuilder().withStructure(boardStructure).build();

        String actual = board.getStructure();

        assertEquals(boardStructure, actual);
    }

    @Test
    public void canBuildBoardWithBoardSize(){
        String boardSize = "correct size";
        Board board = new BoardBuilder().withSize(boardSize).build();

        String actual = board.getSize();

        assertEquals(boardSize, actual);
    }

    @Test
    public void canBuildBoardWithBoardTemplate(){
        String boardTemplate = "correct template";
        Board board = new BoardBuilder().withTemplate(boardTemplate).build();

        String actual = board.getTemplate();

        assertEquals(boardTemplate, actual);
    }
}