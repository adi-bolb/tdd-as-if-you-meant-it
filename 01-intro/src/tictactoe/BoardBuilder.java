package tictactoe;

public class BoardBuilder {

    private String structure;

    public BoardBuilder withStructure(String structure){

        this.structure = structure;
        return this;
    }

    

    public Board build(){
        return new Board(structure);
    }
}
