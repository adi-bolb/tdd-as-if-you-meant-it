import org.junit.Test;
import tictactoe.Board;

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

    @Test
    public void createBoardTest(){
        // Arrange
        String populated = "two by two with X on left column";
        String size = "two by two";
        String structure = "with X on left column";
        Board expected = new Board(populated, structure, size);

        // Act
        Board actual = new Board(populated, structure, size);

        // Assert
        assertEquals(expected, actual);
    }
}
