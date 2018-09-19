package Lec7.FlowControl;

import java.util.Scanner;

public class Ex18 {
    // input: 4
    // 3s    1
    // 2s   2 2
    // 1s  3 3 3
    // 0s 4 4 4 4
    // (input - line)s + content * line
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.valueOf(scan.nextLine());
        int num = 1;
        for(int line = 1; line <= input; line++) {
            // spaces
            for(int space = 0; space < (input - line); space++){
                System.out.print(" ");
            }
            // content
            for(int content = 0; content < line; content++) {
                System.out.print(num + " ");
            }
            System.out.println();
            num++;
        }
        scan.close();
    }
}
