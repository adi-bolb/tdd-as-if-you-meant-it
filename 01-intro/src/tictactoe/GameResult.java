package tictactoe;

public class GameResult {

    private final GameMessage gameMessage;
    private final BoardStage boardStage;

    public GameResult(GameMessage gameMessage, BoardStage boardStage) {
        this.gameMessage = gameMessage;
        this.boardStage = boardStage;
    }

    public String getGameResult(Board board){
        // TODO: Extract new BoardStructure to outside of this class
        String currentBoard = board.getStructure();
        if(currentBoard == boardStage.getEmptyBoard()) {
            return gameMessage.getGameMessageNobodyWon();
        }

        return board.getTemplate().equals(board.getSize() + board.getStructure()) ? gameMessage.getGameMessageXWon() : gameMessage.getGameMessageNobodyWon();
    }
}