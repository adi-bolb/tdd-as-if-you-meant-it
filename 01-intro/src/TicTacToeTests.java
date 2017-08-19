import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TicTacToeTests {

    /*
    *
    * Think-> Red -> Green -> Refactor
    *
    * Guideline 1: Always start with outputs when doing an analysis
    *
    * Tic Tac Toe Game:
    *   * 3x3 board
    *   * X plays first
    *   * 0 plays second
    *   * Results:
    *       * X won
    *       * 0 won
    *       * Draw
    *   * Win conditions:
    *       * On column
    *       * On line
    *       * On diagonal
    *
    * Guideline: Behavior Slicing
    * Inputs                Outputs
    * X finished line       X won
    * X finished column     X won
    * X finished diagonal   X won
    *
    *
    * Guideline: SIMPLIFY!
    *
    * Guideline: Introduce only one notion (domain concept) at a time, one per test
    *
    * Guideline: The rule of three "only extract duplication when spotted at least three times"
    *
    * Guideline: Triangulation
    *
    * */

    @Test
    public void forOneByOneBoardXAlwaysWins(){
        // Arrange
        String board = "one by one";
        String expected = "X won";

        // Production code
        String gameResult = board == "one by one" ? "X won" : "Nobody won";

        // Act
        String actual = gameResult;

        // Assert
        assertEquals(expected, actual);
    }
}
