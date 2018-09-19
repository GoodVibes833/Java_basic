package Lec7.FlowControl;

import java.util.Scanner;

public class Ex24 {
    // half 4
    // line1: 3sp    1
    // line2: 2sp   212
    // line3: 1sp  32123
    // line4: 0sp 4321234

    // linen:(half-line)sp  (half-sp)->1  1->(half-sp)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int half = Integer.valueOf(scan.nextLine());
        for(int line = 1; line <= half; line++) {
            // space
            int spaces = half - line;
            for(int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            // num backwards
            for(int nums = half - spaces; nums > 0; nums--) {
                System.out.print(nums);
            }
            // num forwards
            for(int nums = 2; nums <= half - spaces; nums++) {
                System.out.print(nums);
            }
            System.out.println();
        }

        for(int line = half-1; line >= 0; line--) {
            // space
            int spaces = half - line;
            for(int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            // num backwards
            for(int nums = half - spaces; nums > 0; nums--) {
                System.out.print(nums);
            }
            // num forwards
            for(int nums = 2; nums <= half - spaces; nums++) {
                System.out.print(nums);
            }
            System.out.println();
        }

    }

}
