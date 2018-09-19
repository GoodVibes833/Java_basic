package Day4;

import java.io.File;
import java.util.Scanner;

public class GetInput {
    public static void main(String[] args) {
        // Create a scanner object
        File country = new File("countries.txt");
        try {
            Scanner scan = new Scanner(country);
            while (scan.hasNext()) {
                System.out.println(scan.nextLine());
            }
            scan.close();

        } catch (Exception fe) {
            System.out.println(fe.getMessage());
        }


        Scanner scan = new Scanner(System.in);
        // Get nextline as String
        String firstline = scan.nextLine();
        // input()

        // Split the firstline into an array
        String[] arr = firstline.split(" ");
        int id = Integer.valueOf(arr[0]); // int()

        String name = arr[1];
        System.out.println((id + 10) + " :  " + name);
        scan.close();

    }
}
