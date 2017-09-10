package tictactoe;

public class Board {
    private String boardStructure;
    private String boardSize;

    public Board(String boardStructure) {
        this.boardStructure = boardStructure;
    }

    public Board(String boardStructureDoesntMatter, String boardSize) {
        this.boardSize = boardSize;
    }

    public String getStructure() {
        return boardStructure;
    }

    public String getBoardSize() {
        return boardSize;
    }
}
