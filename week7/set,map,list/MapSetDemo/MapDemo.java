package CollectionsInJava;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        // Template
        // List<String>
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Derrick", "7781723485");
        phoneBook.put("Bianca", "7785832737");
        phoneBook.put("Javier", "6047008233");
        phoneBook.put("Yukako", "7783787906");
        phoneBook.put("Alex", "4319977890");


        for(String name: phoneBook.keySet()) {
            System.out.println(phoneBook.get(name));
        }

        Collection<String> numbers = phoneBook.values();
        for(String num: numbers) {
            System.out.println(num);
        }

       Set<String> keys = phoneBook.keySet();
       Iterator<String> iter = keys.iterator();
       System.out.println(iter);
       
       while (iter.hasNext()) {
           String num = phoneBook.get(iter.next());
           System.out.println(num);
       }

        // size
       System.out.println(phoneBook.size());

       phoneBook.put("Bianca", "5744548399");

       System.out.println(phoneBook.get("Bianca"));
       System.out.println(phoneBook.size());
        // keys have to be unique.
       phoneBook.remove("Bianca");
       System.out.println(phoneBook.size());






//
//        List<String> arrList = new ArrayList<>();
//        arrList.add("Minami");
//        arrList.add("Bianca");
//        arrList.add("Victor");
//        arrList.add("Marcelo");
//        arrList.add("Nagisa");
//        arrList.add("Alex");
//        arrList.add("Emre");
//        arrList.add("Juan");
//        arrList.add("Sue");
//        arrList.add("Marla");
//
//        for(int i = 0; i < arrList.size(); i++) {
//            System.out.println(arrList.get(i));
//        }
//
//        for(String name: arrList) {
//            System.out.println(name);
//        }
//
//        Iterator<String> iter = arrList.iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }

    }
}
