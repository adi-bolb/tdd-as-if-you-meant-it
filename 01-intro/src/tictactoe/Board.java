package tictactoe;

public class Board {
    private String template;
    private String state;
    private String size;

    public Board(String state, String size, String template) {
        this.state = state;
        this.size = size;
        this.template = template;
    }

    public String getState() {
        return state;
    }

    public String getSize() {
        return size;
    }

    public String getTemplate() {
        return template;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Board board = (Board) o;

        if (template != null ? !template.equals(board.template) : board.template != null) return false;
        if (state != null ? !state.equals(board.state) : board.state != null) return false;
        return size != null ? size.equals(board.size) : board.size == null;
    }

    @Override
    public int hashCode() {
        int result = template != null ? template.hashCode() : 0;
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        return result;
    }
}