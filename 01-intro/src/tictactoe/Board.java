package tictactoe;

public class Board {
    private final String populated;
    private final String structure;
    private final String size;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Board board = (Board) o;

        if (!populated.equals(board.populated)) return false;
        if (!structure.equals(board.structure)) return false;
        return size.equals(board.size);
    }

    @Override
    public int hashCode() {
        int result = populated.hashCode();
        result = 31 * result + structure.hashCode();
        result = 31 * result + size.hashCode();
        return result;
    }

    public Board(String populated, String structure, String size) {
        this.populated = populated;
        this.structure = structure;
        this.size = size;
    }
}
