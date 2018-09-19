package Chapter15;
import java.io.*;
import java.net.URI;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;

public class MyFileIO {

    private static Formatter out;
    private static Scanner in;

    public static void getFileOrDirectoryInfo() {
        // Program that takes user input (file name or dir name)
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a file or directory name: ");
        String name = scan.nextLine();

        // creating a path object based on user input
        Path path = Paths.get(name);

        if (Files.exists(path)) {
            System.out.printf("%s exists%n", path.getFileName());
            System.out.printf("%s a directory%n", Files.isDirectory(path) ? "Is" : "Is not");
            System.out.printf("%s an absolute path%n", path.isAbsolute() ? "Is" : "Is not");
            try {
                // TODO: change the timezone
                System.out.printf("Last modified: %s%n", Files.getLastModifiedTime(path));
                System.out.printf("Size: %s%n", Files.size(path));
                System.out.printf("Path: %s%n", path);
                System.out.printf("Absolute path: %s%n", path.toAbsolutePath());

            } catch (IOException e) {
                e.printStackTrace();
            }
            if (Files.isDirectory(path)) {
                try {
                    DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
                    for(Path p : directoryStream) {
                        System.out.println(p);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        } else {
            System.out.printf("%s does not exist%n", path);
        }
    }

    public static void openFileToWriteInfo(String filename) {
        try {
            out = new Formatter(filename); // open the file

        } catch (FileNotFoundException e) {

            e.printStackTrace();
            System.exit(1); // terminate the program
        }
    }

    public static void addInfo() {
        // 1. get input(info) from the console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some information about this student: ");

        while (scan.hasNext()) {
            try {
                out.format("%s%n", scan.nextLine());
            } catch (FormatterClosedException e) {
                System.err.println("Error writing to file. Terminating...");
                break;
            }
        }
    }

    public static void openFileToReadInfo(String path) {
        try {
            in = new Scanner(Paths.get(path));

        } catch (IOException e) {
            System.err.println("Error opening file. Terminating...");
            System.exit(1);
        }
    }

    public static void readInfo() {
        try {
            while (in.hasNext()) {
                System.out.println(in.nextLine());
            }

        } catch (IllegalStateException e) {
            // If Scanner is closed before data is input
            System.err.println("Error reading from file. Terminating...");
            System.exit(1);
        }
    }

    public static void closeFile() {
        if (out != null) {
            out.close();
        }
        if (in != null) {
            in.close();
        }
    }

}
