public class RandomLetterChooser extends RandomStringChooser {

    public RandomLetterChooser(String str) {
        super(getSingleLetters(str));
    }

    /**
     * Returns a given input str as an array
     * @param str
     * @return
     */
    public static String[] getSingleLetters(String str) {
        // "abcd" -> {"a", "b", "c", "d"}
        String[] arr = new String[str.length()];
        for(int i = 0; i < str.length(); i++) {
            arr[i] = str.substring(i, i + 1);
        }
        return arr;
    }
}
