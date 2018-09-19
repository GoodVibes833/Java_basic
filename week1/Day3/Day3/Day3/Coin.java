package Day3;

public class Coin {
    private final int HEADS = 0;
    private int face;

    public Coin() {
        this.face = 0;
    }

    public void flip() {
        // 0 <= Math.random() * 2 < 2
        int f = (int)(Math.random() * 2);
        this.face = f;
    }

    public boolean isHeads() {
        return this.face == HEADS;
    }

    @Override
    public String toString() {
        if (face == HEADS) {
            return "HEADS";
        }
        return "TAILS";
    }
}
