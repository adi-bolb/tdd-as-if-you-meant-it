package tictactoe.tests;

import org.junit.Before;
import org.junit.Test;
import tictactoe.Board;
import tictactoe.BoardBuilder;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class BoardTests {

    private BoardBuilder boardBuilder;

    @Before
    public void setUp() throws Exception {
        boardBuilder = new BoardBuilder();
    }

    @Test
    public void canBuildBoardWithCorrectBoardStructure(){
        String boardStructure = "correct board structure";
        Board board = boardBuilder.withState(boardStructure).build();

        String actual = board.getState();

        assertEquals(boardStructure, actual);
    }

    @Test
    public void canBuildBoardWithBoardSize(){
        String boardSize = "correct size";
        Board board = boardBuilder.withStructure(boardSize).build();

        String actual = board.getSize();

        assertEquals(boardSize, actual);
    }

    @Test
    public void canBuildBoardWithBoardTemplate(){
        String boardTemplate = "correct template";
        Board board = boardBuilder.withTemplate(boardTemplate).build();

        String actual = board.getTemplate();

        assertEquals(boardTemplate, actual);
    }

    @Test
    public void boardInstanceIsEqualToItself(){
        Board board = boardBuilder.withState("good")
                .withStructure("good as well")
                .withTemplate("very good")
                .build();

        assertEquals(board, board);
    }

    @Test
    public void twoBoardInstancesWithSameValuesAreEqual(){
        Board firstBoard = boardBuilder.withState("good")
                .withStructure("good size")
                .withTemplate("good template")
                .build();
        Board secondBoard = boardBuilder.withState("good")
                .withStructure("good size")
                .withTemplate("good template")
                .build();

        assertEquals(firstBoard, secondBoard);
    }

    @Test
    public void twoBoardInstancesWithDifferentValuesAreNotEqual(){
        Board firstBoard = boardBuilder.withState("good 1")
                .withStructure("good size 1")
                .withTemplate("good template 1")
                .build();
        Board secondBoard = boardBuilder.withState("good 2")
                .withStructure("good size 2")
                .withTemplate("good template 2")
                .build();

        assertThat(firstBoard, is(not(secondBoard)));
    }
}