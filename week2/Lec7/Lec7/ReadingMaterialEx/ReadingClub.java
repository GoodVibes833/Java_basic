package Lec7.ReadingMaterialEx;//********************************************************************
//  ReadingClub.java        Java Foundations
//
//  Solution to Programming Project 8.3 
//********************************************************************

public class ReadingClub
{
    //-----------------------------------------------------------------
    //  Creates several objects from classes derived from the
    //  ReadingMaterial class.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {

        ReadingMaterial rm =  new ReadingMaterial("How to program, Java", "12124813489");
        Book bk = new Book("Lord of the ring.", "1324891321", "Elf");
        String[] chars = {"Harry Potter", "Hermione"};
        Novel nv = new Novel("Harry Potter", "134124121", "J.K. Rolling", chars);

        ReadingMaterial[] bookshelf = new ReadingMaterial[3];
        bookshelf[0] = rm;
        bookshelf[1] = bk;
        bookshelf[2] = nv;

        // Down casting
        ((Novel) bookshelf[2]).priceTag();

        // Polymorphism
        for (ReadingMaterial b: bookshelf) {
            // run : dynamic binding
            b.content();
        }

//        ReadingMaterial[] rm = new ReadingMaterial[5];
//
//        rm[0] = new ReadingMaterial("Myst Strategy", "0-7615-0807-4");
//
//        rm[1] = new Book("Great Eskimo Vocabulary Hoax, The",
//                "0-226-68534-9", "Pullum, Geoffrey");
//
//        rm[2] = new TextBook("Java Software Solutions",
//                "0-321-40949-3", "Lewis, John and William Loftus",
//                true);
//
//        String[] names = { "Hazel", "Fiver", "Bigwig",
//                "Blackberry", "Dandelion" };
//
//        rm[3] = new Novel("Watership Down", "0-380-00293-0",
//                "Adams, Richard", names);
//
//        rm[4] = new Magazine("ACM Crossroads", "0-234-5678-0",
//                "Perry, Lynellen and others");
//
//        for (int index = 0; index < rm.length; index++)
//        {
//            rm[index].content();
//            System.out.println();
//        }
    }
}
