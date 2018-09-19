package Lab3;

public class Knight extends ChessPiece {
    private static final int KNIGHT_IMPORTANCE = 2;

    public Knight() {
        super(KNIGHT_IMPORTANCE);
    }

    @Override
    public String toString() {
        return "Knight [value=" + getValue() + "]";
    }

    @Override
    public void move() {
        System.out.println("like an L");
    }
}
