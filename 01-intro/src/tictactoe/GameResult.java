package tictactoe;

public class GameResult {

    private final GameMessage gameMessage;

    public GameResult(GameMessage gameMessage) {
        this.gameMessage = gameMessage;
    }

    public String getGameResult(Board board){
        // TODO: Extract new BoardStructure to outside of this class
        String currentBoard = board.getStructure();
        if(currentBoard == BoardStage.getEmptyBoard()) {
            return gameMessage.getGameMessageNobodyWon();
        }

        return board.getTemplate().equals(board.getSize() + board.getStructure()) ? gameMessage.getGameMessageXWon() : gameMessage.getGameMessageNobodyWon();
    }
}