package tictactoe;

public class BoardBuilder {

    private String structure;
    private String size;

    public BoardBuilder withStructure(String structure){

        this.structure = structure;
        return this;
    }

    public BoardBuilder withSize(String size){

        this.size = size;
        return this;
    }

    public Board build(){
        return new Board(structure, size);
    }
}
