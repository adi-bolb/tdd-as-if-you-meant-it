package tictactoe;

public class BoardBuilder {

    private String structure;
    private String size;
    private String template;

    // TODO: Extract strings from this file to settings

    public String getTokenVecinityPosition(String token) {
        return "with " + token + " on";
    }

    public String buildBoardStructure(String tokenVecinityPosition, String direction) {
        String column = "column"; String space = "";
        return space + tokenVecinityPosition + space + direction + space + column;
    }

    public String buildBoardTemplate(String typeOfBoard, String boardStructure) {
        return typeOfBoard + boardStructure;
    }

    public Board buildBoard(BoardStructure boardStructure, String direction, String token) {
        String boardSize = boardStructure.getStructure();
        String tokenVecinityPosition = getTokenVecinityPosition(token);
        // TODO: See what's going on with the boardStructure1.
        // Using boardStructure just for the size
        String boardStructure1 = buildBoardStructure(tokenVecinityPosition, direction);
        String boardTemplate = buildBoardTemplate(boardSize, boardStructure1);
        return withStructure(boardStructure1).withSize(boardSize).withTemplate(boardTemplate).build();
    }

    public Board buildBoard(String structure) {
        return withStructure(structure).build();
    }

    public BoardBuilder withStructure(String structure){

        this.structure = structure;
        return this;
    }

    public BoardBuilder withSize(String size){

        this.size = size;
        return this;
    }

    public BoardBuilder withTemplate(String template){

        this.template = template;
        return this;
    }

    public Board build(){
        return new Board(structure, size, template);
    }
}
