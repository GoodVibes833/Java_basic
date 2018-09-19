package Lec7;

import Day3.Die;

public class HW {
    // Two Dice
    // after rolling 36_000_000 times,
    // list the occurrences of each case.
    // 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
    // 11 cases.
    public static void main(String[] args) {
        Die die1 = new Die();
        Die die2 = new Die();
        int[] occurrences = new int[13];
        for(int i = 0; i < 36_000_000; i++) {
            die1.roll();
            die2.roll();
            int result = die1.getFaceValue() + die2.getFaceValue();
            occurrences[result]++;
        }
        for (int i = 2; i < occurrences.length; i++) {
            System.out.println(i + " :  " + occurrences[i]);
        }
    }
}
