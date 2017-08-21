import org.junit.Ignore;
import org.junit.Test;
import tictactoe.Board;

import static junit.framework.Assert.assertNotSame;
import static junit.framework.TestCase.assertEquals;

public class BoardTests {


    /*
    *
    * Board
    *
    * Question: what are the responsibilities?
    * Answer: Hold state of the board
    *
    * Question: what state?
    * Answer: populated, structure, size.
    *
    * Guideline 2: Behavior Slicing
    * Inputs                Outputs
    * create                Correct data structure holding the state (populated, structure, size)
    *
    * */

    private Board createBoard(String populated, String structure, String size) {
        return new Board(populated, structure, size);
    }

    @Test
    public void twoBoardInstancesAreEqualWhenHavingAllMembersEqual(){
        // Arrange
        String populated = "two by two with X on left column";
        String size = "two by two";
        String structure = "with X on left column";
        Board expected = createBoard(populated, structure, size);

        // Act
        Board actual = createBoard(populated, structure, size);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void boardInstanceIsEqualToItself(){
        Board board = createBoard("some populated", "some structure", "some size");

        assertEquals(board, board);
    }

    /*
    * Value Sampling (Equivalence Partitioning) : varying the inputs for each method
    *
    * */

    @Test
    public void whenPopulatedIsDifferentTwoBoardsAreNotEqual(){
        String populated = "good populated";
        String wrongPopulated = "wrong populated";
        String structure = "good structure";
        String size = "good size";
        Board expectedBoard = createBoard(populated, structure, size);

        Board board = createBoard(wrongPopulated, structure, size);

        assertNotSame(expectedBoard, board);
    }

    @Test
    public void whenStructureIsDifferentTwoBoardsAreNotEqual(){
        String populated = "good populated";
        String structure = "good structure";
        String wrongStructure = "wrong structure";
        String size = "good size";
        Board expectedBoard = createBoard(populated, structure, size);

        Board board = createBoard(populated, wrongStructure, size);

        assertNotSame(expectedBoard, board);
    }

    @Test
    public void whenSizeIsDifferentTwoBoardsAreNotEqual(){
        String populated = "good populated";
        String structure = "good structure";
        String size = "good size";
        String wrongSize = "wrong size";
        Board expectedBoard = createBoard(populated, structure, size);

        Board board = createBoard(populated, structure, wrongSize);

        assertNotSame(expectedBoard, board);
    }
}
