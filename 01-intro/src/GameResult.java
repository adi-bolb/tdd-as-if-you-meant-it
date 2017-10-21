import tictactoe.Board;

/*
* Hint: When duplication comes into the same class, we increase the cohesion
* of the code.
*
* */

public class GameResult {
    public String getGameResult(String emptyBoard) {
        String gameResultTemp = "";
        String currentBoard = emptyBoard;
        if(currentBoard == emptyBoard) {
            gameResultTemp = "Nobody won";
        }
        return gameResultTemp;
    }

    public String getGameMessageXWon() {
        return "X won";
    }

    private String getGameMessageNobodyWon() {
        return "Nobody won";
    }

    public String getGameResult(Board board){
        BoardStructure boardStructure = new BoardStructure();
        String currentBoard = board.getStructure();
        if(currentBoard == boardStructure.getEmptyBoard()) {
            return "Nobody won";
        }

        return board.getTemplate().equals(board.getSize() + board.getStructure()) ? getGameMessageXWon() : getGameMessageNobodyWon();
    }
}
