package tictactoe;

public class BoardBuilder {

    private String state;
    private String structure;
    private String template;

    // TODO: Extract strings from this file to settings

    public String getTokenVecinityPosition(String token) {
        return "with " + token + " on";
    }

    public String buildBoardState(String tokenVecinityPosition, String direction) {
        String column = "column"; String space = "";
        return space + tokenVecinityPosition + space + direction + space + column;
    }

    public String buildBoardTemplate(String boardStructure, String boardState) {
        return boardStructure + boardState;
    }

    public Board buildBoard(BoardStructure boardStructure, String direction, String token) {
        String tokenVecinityPosition = getTokenVecinityPosition(token);
        // TODO: See what's going on with the boardState.
        // Using boardStructure just for the structure
        String boardState = buildBoardState(tokenVecinityPosition, direction);
        String boardTemplate = buildBoardTemplate(boardStructure.getStructure(), boardState);
        return withState(boardState).withStructure(boardStructure.getStructure()).withTemplate(boardTemplate).build();
    }

    public Board buildBoard(String state) {
        return withState(state).build();
    }

    public BoardBuilder withState(String state){

        this.state = state;
        return this;
    }

    public BoardBuilder withStructure(String structure){

        this.structure = structure;
        return this;
    }

    public BoardBuilder withTemplate(String template){

        this.template = template;
        return this;
    }

    public Board build(){
        return new Board(state, structure, template);
    }
}
