package Day3;

public class CountFlips {
    public static void main(String[] args) {
        // flip a coin 1000 times and count the number of
        // heads and tails
        final int FLIPS = 1000;
        Coin myCoin = new Coin();

        int count_heads = 0;
        for(int i = 0; i < FLIPS; i++) {
            myCoin.flip();
            if (myCoin.isHeads()) {
                count_heads++;
            }
        }
        System.out.println("HEADS: " + count_heads);
        System.out.println("TAILS: " + (FLIPS - count_heads));

    }
}
