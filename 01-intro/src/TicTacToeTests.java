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

    private String getGameMessageXWon() {
        return "X won";
    }

    private String getGameMessageNobodyWon() {
        return "Nobody won";
    }

    private String buildBoard(String typeOfBoard, String boardStructure) {
        return typeOfBoard + boardStructure;
    }

    @Test
    public void forOneByOneBoardXAlwaysWins(){
        // Settings
        String boardOneByOne = "one by one";

        // Arrange
        String board = buildBoard(boardOneByOne, "");

        // Production code
        String gameResult = board.equals(boardOneByOne) ? getGameMessageXWon() : getGameMessageNobodyWon();

        // Act
        String actual = gameResult;

        // Assert
        assertEquals(getGameMessageXWon(), actual);
    }
    // Introduced the notion of winning

    /*
    * Intotroduced the notion of column
    * X 0
    * X
    * */
    @Test
    public void forTwoByTwoBoardXWinsOnLeftColumn(){
        // Settings
        String boardTwoByTwo = "two by two";
        String column = "column";

        // Arrange
        String board = buildBoard(boardTwoByTwo, " with X on left" + " " + column);

        // Production code
        String gameResult = board.equals(boardTwoByTwo + " with X on left " + column) ? getGameMessageXWon() : getGameMessageNobodyWon();

        // Act
        String actual = gameResult;

        // Assert
        assertEquals(getGameMessageXWon(), actual);
    }

    /*
    * Introduced no new notions
    * 0  X
    *    X
    * */
    @Test
    public void forTwoByTwoBoardXWinsOnRightColumn(){
        // Settings
        String boardTwoByTwo = "two by two";
        String column = "column";

        // Arrange
        String board = buildBoard(boardTwoByTwo, " with X on right" + " " + column);

        // Production code
        String gameResult = board.equals(boardTwoByTwo + " with X on right " + column) ? getGameMessageXWon() : getGameMessageNobodyWon();

        // Act
        String actual = gameResult;

        // Assert
        assertEquals(getGameMessageXWon(), actual);
    }
}