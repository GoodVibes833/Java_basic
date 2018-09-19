package Lab5_RandomLetter;

import java.util.ArrayList;

/**
 * @author Alex Han
 */

public class RandomStringChooser {
    String str;
    ArrayList<String> arr;

    /**
     * array to arrayList
     * @param str any string
     */
    public RandomStringChooser(String[] str) {
        arr = new ArrayList<>();
        for(String word : str){
            arr.add(word);
        }
    }

    /**
     *
     * @return all strings randomly and none when there is no elements
     */
    public String getNext(){
        if(arr.size()>0){
           int index = (int) (Math.random()*arr.size());
           return arr.remove(index);
        }
        return "None";

    }

}
