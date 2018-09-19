package Lab3;

public class Rook extends ChessPiece {
    public static final int ROOK_IMPORTANCE = 5;

    public Rook() {
        super(ROOK_IMPORTANCE);
    }

    @Override
    public String toString() {
        return "Rook [value=" + getValue() +  "]";
    }

    @Override
    public void move() {
        System.out.println("horizontally or vertically");
    }
}
