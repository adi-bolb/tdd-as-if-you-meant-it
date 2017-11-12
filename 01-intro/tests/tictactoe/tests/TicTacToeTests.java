package tictactoe.tests;

import org.junit.Before;
import org.junit.Test;
import tictactoe.*;

import static junit.framework.TestCase.assertEquals;

public class TicTacToeTests {

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
        Board emptyBoard = boardBuilder.buildBoard(BoardStage.getEmptyBoard());

        assertEquals(gameMessage.getGameMessageNobodyWon(), gameResult.getGameResult(emptyBoard));
    }

    @Test
    public void forOneByOneBoardXAlwaysWins(){
        Board board = boardBuilder.buildBoard(boardStructure.getBoardOneByOne(), direction.left(), Token.X());

        assertEquals(gameMessage.getGameMessageXWon(), gameResult.getGameResult(board));
    }

    @Test
    public void forTwoByTwoBoardXWinsOnLeftColumn(){
        Board board = boardBuilder.buildBoard(boardStructure.getBoardTwoByTwo(), direction.left(), Token.X());

        assertEquals(gameMessage.getGameMessageXWon(), gameResult.getGameResult(board));
    }

    @Test
    public void forTwoByTwoBoardXWinsOnRightColumn(){
        Board board = boardBuilder.buildBoard(boardStructure.getBoardTwoByTwo(), direction.right(), Token.X());

        assertEquals(gameMessage.getGameMessageXWon(), gameResult.getGameResult(board));
    }

    @Test
    public void forTwoByTwoBoardXWinsOnTopLine(){
        Board board = boardBuilder.buildBoard(boardStructure.getBoardTwoByTwo(), direction.top(), Token.X());

        assertEquals(gameMessage.getGameMessageXWon(), gameResult.getGameResult(board));
    }
}