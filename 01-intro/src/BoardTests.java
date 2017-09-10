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

    @Test
    public void canBuildBoardWithBoardSize(){
        String boardSize = "correct size";
        String boardStructureDoesntMatter = "board structure doesnt matter";
        Board board = new Board(boardStructureDoesntMatter, boardSize);

        String actual = board.getBoardSize();

        assertEquals(boardSize, actual);
    }

    @Test
    public void canBuildBoardWithBoardTemplate(){
        String boardTemplate = "correct template";
        String boardStructureDoesntMatter = "doesnt matter";
        String boardSizeDoesntMatter = "doesnt matter";
        Board board = new Board(boardStructureDoesntMatter, boardSizeDoesntMatter, boardTemplate);

        String actual = board.getTemplate();

        assertEquals(boardTemplate, actual);
    }
}