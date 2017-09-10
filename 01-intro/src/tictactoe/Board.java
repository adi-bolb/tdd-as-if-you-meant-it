package tictactoe;

public class Board {
    private String boardTemplate;
    private String boardStructure;
    private String boardSize;

    public Board(String boardStructure) {
        this.boardStructure = boardStructure;
    }

    public Board(String boardStructureDoesntMatter, String boardSize) {
        this.boardSize = boardSize;
    }

    public Board(String boardStructureDoesntMatter, String boardSizeDoesntMatter, String boardTemplate) {

        this.boardTemplate = boardTemplate;
    }

    public String getStructure() {
        return boardStructure;
    }

    public String getBoardSize() {
        return boardSize;
    }

    public String getTemplate() {
        return boardTemplate;
    }
}
