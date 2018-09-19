package Chapter14;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WrapperClasses {

    public static void main(String[] args) {
        // Autoboxing
        Character ch1 = 'D';
        char ch2 = 'D';
        char undefined = 'c';

        // Unicode (ASCII)
        System.out.println(Character.isDefined(undefined)); // Unicode
        System.out.println(Character.isDigit('A'));  // [0-9]
        System.out.println(Character.isLetter('0')); // [A-Za-z]
        Character.isLetterOrDigit(ch2);
        Character.isUpperCase(ch2);
        Character.isLowerCase(ch2);
        Character.toLowerCase(ch2);
        Character.toUpperCase(ch2);
        Character.isJavaIdentifierStart(ch2); // [A-Za-z_$]
        Character.isJavaIdentifierPart(ch2); // [A-Za-z0-9_$]

        int $varia8b342le1; // Identifier: anything you can name

        // Binary(2), Octal(8), Hexadecimal(16), Decimal(10)

        // Decimal (10) 0-9
        //   2      4      1
        // 10^2    10^1   10^0

        // Binary (2) 0-1
        // Octal (8 = 2^3) 0-7
        // Hexadecimal(16 = 2^4) 0-9 A B C D E F

        //     0     0
        //     F     F    => 255
        //   16^1  16^0

        // 15 * 16 + 15 * 1 => 255
        // RGB( 0x000000) - black
        // RGB( 0xFFFFFF) - white

        // "0b110101011"

        String a = "0x12FA0B"; // Base 16
        // 1 * 16^5 + 2 * 16^4 + F * 16^3 + A * 16^2 + 0 * 16^1 + B * 16^0
        if (a.startsWith("0x")) {
            int length = a.length() - 3;
            char[] hex = a.toCharArray();
            int decimal = 0;
            for(int i = 2; i < a.length(); i++) {
                decimal += Character.digit(hex[i], 16) * Math.pow(16, length);
                length--;
            }
            System.out.println(decimal);
        }

        System.out.println(Character.digit('A', 16));
        System.out.println(Character.forDigit(15, 16));

        Character c = 'C';
        char c_2 = c; // Auto-unboxing
        char c_1 = c.charValue();

        // Tokens - Sentence breaks into tokens
        // "This is a sentence"
        // ["This", "is", "a", "sentence"]
        // ex) Compiler (Tokenization)
        // delimiters (separators) ex) " ", "\t", "\n"

        String sentence = "This is a sentence";
        String[] tokens = sentence.split(" ");
        for(String token: tokens) {
            System.out.println(token);
        }

        // Regular Expressions
        // : A specially formatted String that describes a search
        //   pattern for matching characters in other Strings.
        //
        //  - Useful for validating input and ensuring that data is in a right format.

        // predefined character (classes)
        // - \d : any digit             - \D : non-digit
        // - \w : any word(U,L,D,_)     - \W : non-word
        // - \s : any white-space       - \S : non-whitespace
        // . : any 1 char

        // Operators
        // ? : 0 or 1 char of any
        // {n} : exactly n
        // {n, m} : matches between n and m occurrences
        // + : 1...more
        // * : 0...more
        // | : or

        // define a set of characters - [A-Za-z0-9_$], [^Z]
        String number = "778.291.8374";
        // \d{3}-\d{3}-\d{4}
        boolean match = number.matches("\\d+[-.]?\\d+[-.]?\\d+");
        System.out.println(match);

        // Firstname
        String firstname = "; DROP Database;";
        firstname.matches("[A-Z][a-z]+");
        // email
        String email = "asdf@dfs.af";
        System.out.println(email.matches("\\w+@\\w+\\.\\w+"));


        String firstString = "This sentence ends in 5 stars *****";
        String secondString = "1, 2, 3, 4, 5, 6, 7, 8";

        // * -> ^
        firstString = firstString.replaceAll("\\*", "^");
        System.out.println(firstString);

        firstString = firstString.replaceAll("stars", "carets");
        System.out.println(firstString);

        firstString = firstString.replaceAll("\\w+", "word");
        System.out.println(firstString);

        // "digit, digit, digit, 4, 5, 6, 7, 8";
        for(int i = 0; i < 3; i++) {
            secondString = secondString.replaceFirst("\\d", "digit");
        }
        System.out.println(secondString);

        // (Greedy algorithms)
        // ["digit", "digit", "digit", "4", "5", "6", "7", "8"];
        String[] words = secondString.split(",\\s*");
        System.out.println(Arrays.toString(words));

        // java.util.regex

        // Pattern - represents a regular expression
        // Matcher - contains both a regular-expression pattern and
        //           a CharSequence in which to search for the pattern.
        // CharSequence - an interface that allows read access to a seq of chars.

        String s = "Javier's Birthday is 12-25-90\nMinami's Birthday is 06-28-88\nMarla's Birthday is 09-29-86\nMarcelo's Birthday is 11-26-91";

        // create regular expression
        Pattern exp = Pattern.compile("M.*\\d{2}-\\d{2}-[0-8]\\d");

        Matcher matcher = exp.matcher(s);

        // .find() tries to match a piece of the search string to regex.
        // Each call to this .find() methods starts at the point where the last call ended.
        while (matcher.find()) {
            // .group() returns the String from the search str that matches the regex.
            // The string that is returned is the one that was last matched by a call to
            // .find() method.
            System.out.println(matcher.group());
        }













    }
}










