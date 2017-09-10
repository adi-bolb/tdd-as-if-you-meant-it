package tictactoe;

public class Board {
    private String boardStructure;

    public Board(String boardStructure) {
        this.boardStructure = boardStructure;
    }

    public String getStructure() {
        return boardStructure;
    }
}
