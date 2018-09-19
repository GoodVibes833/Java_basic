package Lab5_RandomLetter;

import java.util.ArrayList;
import java.util.Arrays;


public class Client {

    public static void main(String[] args) {

        String[] wordArray = {"a","b","c","d"};
        RandomStringChooser sChooser = new RandomStringChooser(wordArray);

    for(int i=0; i<6; i++) {
        System.out.print(sChooser.getNext()+ " ");
    }
        System.out.println(" ");
        RandomLetterChooser letterChooser = new RandomLetterChooser(wordArray);
        ArrayList<String> result = letterChooser.getSingleLetters("QWER");
        System.out.println(result);

        for(int i=0; i<6; i++) {
            System.out.print(letterChooser.getNext()+" ");
        }

    }
}
