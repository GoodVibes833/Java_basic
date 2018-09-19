package Day3;

public class FlipRace {
    // flip two coins until one of them comes up heads
    // three times in a row. (winner)
    public static void main(String[] args) {
        Coin luke = new Coin();
        Coin angel = new Coin();
        int luke_counter = 0;
        int angel_counter = 0;

        while (luke_counter < 3 && angel_counter < 3) {
            luke.flip();
            angel.flip();
            // Ternary operator
            // bool_expr ? true_statement : false_statement
            luke_counter = luke.isHeads() ? luke_counter + 1 : 0;
            angel_counter = angel.isHeads() ? angel_counter + 1 : 0;
        }

        String winner = luke_counter == 3 ? "Luke" : "Angel";
        System.out.println("Congrats "+ winner + "! You are the winner!");
    }
}
