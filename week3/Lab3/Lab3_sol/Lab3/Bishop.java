package Lab3;

public class Bishop extends ChessPiece {
    // constant
    public static final int BISHOP_IMPORTANCE = 3;
    public Bishop() {
        super(BISHOP_IMPORTANCE);
    }

    @Override
    public String toString() {
        return super.toString() + "(" + getValue() + ")";
    }

    @Override
    public void move() {
        System.out.println("Diagonally");
    }


}
