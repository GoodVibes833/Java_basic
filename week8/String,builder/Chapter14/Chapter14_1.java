package Chapter14;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Chapter14_1 {

    public static void main(String[] args) {
        // Primitive types: byte short int long char boolean float double
        // Reference types: Integer Character Double

        // String - A sequence of characters
        // String literals are written as a sequence of characters
        //     in double quotation.
        String name1 = "Derrick";
        String name2 = "Derrick";

        System.out.println(name1 == name2);

        String a = new String(); // ""
        String b = new String("Vancouver"); // Vancouver

        char[] charArray = {'D', 'e', 'r', 'r', 'i', 'c', 'k'};
        String c = new String(charArray);
        String d = new String(charArray, 3, 4); // "rick"
        System.out.println(d);

        String e = "Derrick";
        char[] charArray1 = e.toCharArray();

        // Strings are immutable (can not change)

        // Basic String methods.
        String s1 = "Hello, there";
        s1.length(); // the number of chars
        s1.charAt(0); // returns the char at the given index,'H'
        char[] chars = new char[20];
        s1.getChars(7, 12, chars, 0);
        // getChars: (source) String -> (destination) char[] (more selective)

        // Compare Strings
        // .equals()
        String s3 = "Happy Birthday";
        String s5 = "happy birthday";

        String s4 = "Feliz Cumpleanos";
        String s7 = "Feliz aniversario";

        String s6 = "Otanjoubi Omedetou";
        String s8 = "Saeng Chuk";

        s3.equals(s5);
        s3.substring(0, 5).equalsIgnoreCase(s5.substring(9, 14));
        s3.equalsIgnoreCase(s5);
        s3.regionMatches(6, s5, 9, 8);


        // compareTo: pos, 0, neg
        // Lexicographical(Dictionary, Alphabetical) Order
        // "Apps" > "Apple"
        // A: 65      a: 97
        // B: 66      b: 98
        // ...
        System.out.println(s3.compareTo(s5));

        String stmt1 = "Hello, Brazil is good at playing soccer.";
        if (stmt1.startsWith("Brazil", 7)) {
            System.out.println("Because they have Marcelo.");
        }

        if (stmt1.endsWith("soccer.")) {
            System.out.println("Everyone loves soccer.");
        }

        // Location
        String letters = " abcdefghijklmnopqrstuvcwxyz";
        System.out.println(letters.indexOf("f"));
        letters.indexOf("f", 7); // -1

        System.out.println(letters.lastIndexOf('c'));

        // Substring
        String message = "English Bay has many tourist attractions.";
        String part_message = message.substring(8, 11); // "Bay"
        message.substring(8); // "Bay has many tourist attractions."

        String firstname = "David ";
        String lastname = "Beckham";
        String fullname = firstname + lastname;
        String full = firstname.concat(lastname);

        // More methods
        String message1 = "Tim Horton's vs Starbucks vs Blenz";
        message1.toLowerCase();
        message1.toUpperCase();

        Currency usd = Currency.getInstance("USD");
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.ITALY);
        format.setCurrency(usd);
        System.out.println(format.format(23));

        String message2 = "  cornerstone111    ";
        System.out.println(message2.trim()); // remove whitespaces (start, end)
        String replaced = message2.trim().replace("corner", "center");
        System.out.println(replaced);

        String.valueOf(10); // "10"
        String.valueOf(10.12f); // "10.12"
        String.valueOf(3.14); // "3.14"
        String.valueOf(1000L); // "1000"
        char[] van = {'v', 'a', 'n'};
        String.valueOf(van, 1, 2); // "an"

        Object obj = "Derrick";
        String.valueOf(obj);

    }
}
