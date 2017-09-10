package tictactoe;

public class Board {
    private String boardTemplate;
    private String boardStructure;
    private String boardSize;

    public Board(String boardStructureDoesntMatter, String boardSizeDoesntMatter, String boardTemplate) {
        this.boardStructure = boardStructureDoesntMatter;
        this.boardSize = boardSizeDoesntMatter;
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
