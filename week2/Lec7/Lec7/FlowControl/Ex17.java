package Lec7.FlowControl;

import java.util.Scanner;

public class Ex17 {
    // get number of rows: 4
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // for each line, print numbers based on the line number
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = Integer.valueOf(scan.nextLine());

        int num = 1;
        for(int row = 1; row <= rows; row++) {
            for(int col = 0; col < row; col++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        scan.close();
    }
}
