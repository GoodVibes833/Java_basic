package Lec7.ReadingMaterialEx;//********************************************************************
//  Book.java       Java Foundations
//
//  Solution to Programming Project 8.3 
//********************************************************************

public class Book extends ReadingMaterial
{
    protected String author;

    //-----------------------------------------------------------------
    //  Sets up this book with the specified information.
    //-----------------------------------------------------------------
    public Book(String thisTitle, String isbnNum, String auth)
    {
        super(thisTitle, isbnNum);
        author = auth;
    }

    //-----------------------------------------------------------------
    //  Sets the author for this book.
    //-----------------------------------------------------------------
    public void setAuthor(String auth)
    {
        author = auth;
    }

    //-----------------------------------------------------------------
    //  Returns the author of this book.
    //-----------------------------------------------------------------
    public String getAuthor()
    {
        return author;
    }

    //-----------------------------------------------------------------
    //  Returns a description of this book as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        return super.toString() + "\t" + author;
    }

    //-----------------------------------------------------------------
    //  Prints a message appropriate for this book.
    //-----------------------------------------------------------------
    public void content()
    {
        super.content();
        System.out.println("Author: " + author);
    }
}
