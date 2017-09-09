public class GameResult {
    public String getGameMessageXWon() {
        return "X won";
    }

    private String getGameMessageNobodyWon() {
        return "Nobody won";
    }

    public String getGameResult(String boardStructure, String boardSize, String board) {
        return board.equals(boardSize + boardStructure) ? getGameMessageXWon() : getGameMessageNobodyWon();
    }
}
