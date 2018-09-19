package Lab5_RandomLetter;

import Exercise_7_17.Random;
import java.util.ArrayList;

/**
 * @author Alex Han
 */

public class RandomLetterChooser extends RandomStringChooser {


    /**
     * constructor
     * @param str
     */
    public RandomLetterChooser(String[] str) {
        super(str);
    }

    /**
     *
     * @param str input
     * @return str to ArrayList randomly
     */
    public static ArrayList<String> getSingleLetters(String str){
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<str.length(); i++) {
            arr.add(0,str.substring(i, i + 1));
        }
        return arr;


    }


}
