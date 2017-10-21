import tictactoe.Board;

/*
* Hint: When duplication comes into the same class, we increase the cohesion
* of the code.
*
* 
* */

public class GameResult {
    public String getGameMessageXWon() {
        return "X won";
    }

    public String getGameMessageNobodyWon() {
        return "Nobody won";
    }

    public String getGameResult(Board board){
        BoardStructure boardStructure = new BoardStructure();
        String currentBoard = board.getStructure();
        if(currentBoard == boardStructure.getEmptyBoard()) {
            return getGameMessageNobodyWon();
        }

        return board.getTemplate().equals(board.getSize() + board.getStructure()) ? getGameMessageXWon() : getGameMessageNobodyWon();
    }
}
