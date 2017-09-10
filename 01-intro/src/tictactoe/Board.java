package tictactoe;

public class Board {
    private String template;
    private String structure;
    private String size;

    public Board(String structure, String size, String template) {
        this.structure = structure;
        this.size = size;
        this.template = template;
    }

    public String getStructure() {
        return structure;
    }

    public String getSize() {
        return size;
    }

    public String getTemplate() {
        return template;
    }
}
