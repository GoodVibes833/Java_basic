package Lec7.FlowControl;

import java.util.Scanner;

public class Ex23 {
    //     5 (input-line)sp + @ * line
    //     @
    //    @@
    //   @@@
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.valueOf(scan.nextLine());

        for(int line = 1; line <= input; line++) {
            // space (input - line)
            for(int sp = 0; sp <(input-line); sp++) {
                System.out.print(" ");
            }
            for(int at = 0; at < line; at++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
