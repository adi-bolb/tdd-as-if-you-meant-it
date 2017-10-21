package tictactoe;

/*
* Hint: When duplication comes into the same class, we increase the cohesion
* of the code.
*
*
* */

public class GameResult {

    private final GameMessage gameMessage;
    private final BoardStructure boardStructure;

    public GameResult(GameMessage gameMessage, BoardStructure boardStructure) {
        this.gameMessage = gameMessage;
        this.boardStructure = new BoardStructure();
    }

    public String getGameResult(Board board){
        // TODO: Extract new BoardStructure to outside of this class
        String currentBoard = board.getStructure();
        if(currentBoard == boardStructure.getEmptyBoard()) {
            return gameMessage.getGameMessageNobodyWon();
        }

        return board.getTemplate().equals(board.getSize() + board.getStructure()) ? gameMessage.getGameMessageXWon() : gameMessage.getGameMessageNobodyWon();
    }
}
