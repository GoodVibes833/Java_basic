package Lab3;

public class King extends ChessPiece {
    public static final int KING_IMPORTANCE = 1000;

    public King() {
        super(KING_IMPORTANCE);
    }

    @Override
    public String toString() {
        return "King [value=" + getValue() + "]";
    }

    @Override
    public void move() {
        System.out.println("one square");
    }
}
