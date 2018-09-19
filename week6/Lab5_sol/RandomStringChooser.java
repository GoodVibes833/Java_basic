import java.util.ArrayList;

public class RandomStringChooser {

    private ArrayList<String> wordArray; // change size, not remove

    public RandomStringChooser(String[] words) {
        wordArray = new ArrayList<>();
        for(String w: words) {
            wordArray.add(w);
        }
    }

    public String getNext() {
        // 1. Get a random number 0 <=  < wordArray.size()
        if (wordArray.size() > 0) {
            int index = (int) (Math.random() * wordArray.size());
            return wordArray.remove(index);
        }
        return "None";
    }

}
