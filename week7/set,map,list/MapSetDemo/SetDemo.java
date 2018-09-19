package CollectionsInJava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("Angel");
        mySet.add("Luke");
        mySet.add("Katty G");
        mySet.add("Alex");
        mySet.add("Amanda");
        mySet.add("Stacey");
        mySet.add("Summer");
        mySet.add("Jay");
        mySet.add("Jacob");
        mySet.add("Jacob");
        mySet.add("Jacob");
        mySet.add("Jacob");
        mySet.add("Jacob");

        String word = "ABCDEA";

        HashSet<String> unique = new HashSet<>(Arrays.asList(word));

        HashSet<String> unique2 = new HashSet<>();
        for(int i = 0; i < word.length(); i++) {
            unique2.add(word.substring(i, i + 1));
        }

        System.out.println(unique.size() == word.length());
        System.out.println(mySet.size());

    }
}
