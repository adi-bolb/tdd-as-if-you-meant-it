package tictactoe;

/*
* Hint: When duplication comes into the same class, we increase the cohesion
* of the code.
*
*
* */

public class GameResult {

    private final GameMessage gameMessage;

    public GameResult(GameMessage gameMessage) {
        this.gameMessage = gameMessage;
    }

    public String getGameResult(Board board){
        // TODO: Extract new BoardStructure to outside of this class
        BoardStructure boardStructure = new BoardStructure();
        String currentBoard = board.getStructure();
        if(currentBoard == boardStructure.getEmptyBoard()) {
            return gameMessage.getGameMessageNobodyWon();
        }

        return board.getTemplate().equals(board.getSize() + board.getStructure()) ? gameMessage.getGameMessageXWon() : gameMessage.getGameMessageNobodyWon();
    }
}
