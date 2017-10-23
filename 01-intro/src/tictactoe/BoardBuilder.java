package tictactoe;

public class BoardBuilder {

    /*
    * Hint: Move a method and it has the parameter an instance of the class you
    * extracted it to, it means you are creating more cohesion in the design.
    * */

    private String structure;
    private String size;
    private String template;

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

    public Board buildBoard(String boardOneByOne, String tokenVecinityPosition, String direction) {
        String boardSize = boardOneByOne;
        String boardStructure = buildBoardStructure(tokenVecinityPosition, direction);
        String boardTemplate = buildBoardTemplate(boardSize, boardStructure);
        return withStructure(boardStructure).withSize(boardSize).withTemplate(boardTemplate).build();
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
