package tictactoe.tests;

import org.junit.Before;
import org.junit.Test;
import tictactoe.*;

import static junit.framework.TestCase.assertEquals;

public class TicTacToeTests {

    /*
    *
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
    *
    * */

    /*
    * Design Experiments
    *
    * Hypothesis: "two by two", "one by one" should be a class "boardStructure"
    *
    * Plus:
    * No more primitives about Board Structure in the tests
    * All the structure will be in one place. Structural coherence.
    * Some coupling is expected from the tests, but only one other class will use
    * boardStructure
    * Duplication will be removed in-between tests
    * Clarity will be better because a cohesive design structure is extracted
    *
    * Minus:
    * Increased code complexity, because of a new design element
    *
    * */

    private GameResult gameResult;
    private BoardStructure boardStructure;
    private Direction direction;
    private BoardBuilder boardBuilder;

    private GameMessage gameMessage;

    @Before
    public void setup(){
        gameMessage = new GameMessage();
        boardStructure = new BoardStructure();
        gameResult = new GameResult(gameMessage, boardStructure);
        direction = new Direction();
        boardBuilder = new BoardBuilder();
    }

    @Test
    public void whenBoardIsEmptyNobodyWon(){
        // Arrange
        String expected = gameMessage.getGameMessageNobodyWon();
        Board emptyBoard = boardBuilder.buildBoard(boardStructure.getEmptyBoard());

        // Act
        String actual = gameResult.getGameResult(emptyBoard);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void forOneByOneBoardXAlwaysWins(){
        String direction = "";

        // Arrange
        Board board = boardBuilder.buildBoard(boardStructure.getBoardOneByOne(), direction, Token.X());

        // Act
        String actual = gameResult.getGameResult(board);

        // Assert
        assertEquals(gameMessage.getGameMessageXWon(), actual);
    }

    // Introduced the notion of winning

    @Test
    public void forTwoByTwoBoardXWinsOnLeftColumn(){
        // Arrange
        Board board = boardBuilder.buildBoard(boardStructure.getBoardTwoByTwo(), direction.left(), Token.X());

        // Act
        String actual = gameResult.getGameResult(board);

        // Assert
        assertEquals(gameMessage.getGameMessageXWon(), actual);
    }

    /*
    * Intotroduced the notion of column
    * X 0
    * X
    * */

    /*
    * Introduced no new notions
    * 0  X
    *    X
    * */
    @Test
    public void forTwoByTwoBoardXWinsOnRightColumn(){
        // Arrange
        Board board = boardBuilder.buildBoard(boardStructure.getBoardTwoByTwo(), direction.right(), Token.X());

        // Act
        String actual = gameResult.getGameResult(board);

        // Assert
        assertEquals(gameMessage.getGameMessageXWon(), actual);
    }

    @Test
    public void forTwoByTwoBoardXWinsOnTopLine(){
        // Arrange
        Board board = boardBuilder.buildBoard(boardStructure.getBoardTwoByTwo(), direction.top(), Token.X());

        // Production
        String productionCode = gameResult.getGameResult(board);;

        // Act
        String actual = productionCode;

        // Assert
        assertEquals(gameMessage.getGameMessageXWon(), actual);
    }
}