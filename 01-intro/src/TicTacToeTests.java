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
    * Guideline 2: Behavior Slicing
    * Inputs                Outputs
    * X finished line       X won
    * X finished column     X won
    * X finished diagonal   X won
    *
    *
    * Guideline 3: SIMPLIFY!
    *
    * Guideline 4: Introduce only one notion (domain concept) at a time, one per test
    *
    * Guideline 5: The rule of three "only extract duplication when spotted at least three times"
    *
    * Guideline 6: Triangulation
    *
    * */

    // Introduced the notion of winning
    @Test
    public void forOneByOneBoardXAlwaysWins(){
        // Arrange
        String board = "one by one";
        String expected = "X won";

        // Production code
        String gameMessageXWon = getGameMessageXWon();
        String gameResult = board == "one by one" ? gameMessageXWon : "Nobody won";

        // Act
        String actual = gameResult;

        // Assert
        assertEquals(expected, actual);
    }

    /*
    * Intotroduced the notion of column
    * X 0
    * X
    * */
    @Test
    public void forTwoByTwoBoardXWinsOnLeftColumn(){
        // Arrange
        String board = "two by two with X on left column";
        String expected = "X won";

        // Production code
        String gameMessageXWon = getGameMessageXWon();
        String gameResult = board == "two by two with X on left column" ? gameMessageXWon : "Nobody won";

        // Act
        String actual = gameResult;

        // Assert
        assertEquals(expected, actual);
    }

    /*
    * Introduced no new notion
    * 0  X
    *    X
    * */
    @Test
    public void forTwoByTwoBoardXWinsOnRightColumn(){
        // Arrange
        String board = "two by two with X on right column";
        String expected = "X won";

        // Production code
        String gameMessageXWon = getGameMessageXWon();
        String gameResult = board == "two by two with X on right column" ? gameMessageXWon : "Nobody won";

        // Act
        String actual = gameResult;

        // Assert
        assertEquals(expected, actual);
    }

    private String getGameMessageXWon() {
        return "X won";
    }
}