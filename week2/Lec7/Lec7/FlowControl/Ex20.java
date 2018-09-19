package Lec7.FlowControl;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        // input 3
        // 0 2 4 6 8 ... n : 2 * n  (n >= 0)
        // 1 3 5 7 9 ... n : 2 * n - 1  (n >= 1)
        //     *    line 1: 2 space 1 star
        //    ***   line 2: 1 space 3 stars
        //   *****  line 3: 0 space 5 stars
        //    ...
        //          line n: (input-line)space  (2*line - 1) stars
        Scanner scan = new Scanner(System.in);
        int half = Integer.valueOf(scan.nextLine());
        String result = "";
        for(int line = 1; line <= half; line++) {
            // spaces
            for(int space = 0; space < (half - line); space++) {
                System.out.print(" ");
                result += " ";
            }
            // stars
            int stars = 2 * line - 1;
            for(int star = 0; star < stars; star++) {
                System.out.print("*");
                result += "*";
            }
            System.out.println();
            result += "\n";
        }

        for(int line = half - 1; line >= 0; line--) {
            // spaces
            for(int space = 0; space < (half - line); space++) {
                System.out.print(" ");
                result += " ";
            }
            // stars
            int stars = 2 * line - 1;
            for(int star = 0; star < stars; star++) {
                System.out.print("*");
                result += "*";
            }
            System.out.println();
            result += "\n";
        }

        System.out.println(result);
    }
}
