package tictactoe;

/*
* Hint: When duplication comes into the same class, we increase the cohesion
* of the code.
*
*
* */

public class GameResult {

    public String getGameResult(Board board){
        BoardStructure boardStructure = new BoardStructure();
        String currentBoard = board.getStructure();
        if(currentBoard == boardStructure.getEmptyBoard()) {
            return new GameMessage().getGameMessageNobodyWon();
        }

        return board.getTemplate().equals(board.getSize() + board.getStructure()) ? new GameMessage().getGameMessageXWon() : new GameMessage().getGameMessageNobodyWon();
    }
}
