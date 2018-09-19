package Chapter14;

public class Chapter14_2 {
    public static void main(String[] args) {

        // StringBuilder - Creating and manipulating dynamic string information
        //               - that is, modifiable strings!
        //
        // StringBuilder has a capacity. (by default, 16 but you can set the capacity)

        StringBuilder buffer1 = new StringBuilder(); // ""
        StringBuilder buffer2 = new StringBuilder("Hello"); // "Hello"
        StringBuilder buffer3 = new StringBuilder(100); // set capacity

        System.out.println(buffer1.length());
        System.out.println(buffer1.capacity());

        buffer1.ensureCapacity(100);
        System.out.println(buffer1.capacity());

        buffer2.setLength(2);
        System.out.println(buffer2);

        // Performance-Tip
        // Dynamically increasing the capacity of a StringBuilder can
        // take relatively long time. Executing a large number of these
        // operations can degrade the performance of an application.
        // If a StringBuilder is going to increase greatly in size,
        // possibly multiple times, setting its capacity high at the
        // beginning will increase performance.

        // Methods
        StringBuilder builder = new StringBuilder("Hello, what's up?");
        builder.charAt(0);
        char[] arr = new char[10];
        builder.getChars(0, 6, arr, 0);
        builder.reverse();
        builder.setCharAt(0, 'J');
        String content = builder.toString();
        System.out.println(content);

        String a = "ToBeReversed";
        StringBuilder b = new StringBuilder(a);
        b.reverse();
        String reveresed = b.toString();

        StringBuilder buffer = new StringBuilder();
        buffer.append(10)
                .append("\n")
                .append(3.14)
                .append("\n")
                .append("Hello")
                .append(new char[]{'a', 'b', 'c'});

        buffer.insert(0, "Vancouver");
        buffer.delete(3, 9);
        System.out.println(buffer);

    }
}
