package Lec7.ReadingMaterialEx;//********************************************************************
//  ReadingMaterial.java       Java Foundations
//
//  Solution to Programming Project 8.3 
//********************************************************************

public class ReadingMaterial
{
    protected String title, isbn;

    //-----------------------------------------------------------------
    //  Sets up this reading matter with the specified information.
    //-----------------------------------------------------------------
    public ReadingMaterial(String thisTitle, String isbnNum)
    {
        title = thisTitle;
        isbn = isbnNum;
    }

    //-----------------------------------------------------------------
    //  Sets the title for this reading matter.
    //-----------------------------------------------------------------
    public void setTitle(String thisTitle)
    {
        title = thisTitle;
    }

    //-----------------------------------------------------------------
    //  Sets the isbn number for this reading matter.
    //-----------------------------------------------------------------
    public void setISBN(String isbnNum)
    {
        isbn = isbnNum;
    }

    //-----------------------------------------------------------------
    //  Returns the title of this reading matter.
    //-----------------------------------------------------------------
    public String getTitle()
    {
        return title;
    }

    //-----------------------------------------------------------------
    //  Returns the isbn number of this reading matter.
    //-----------------------------------------------------------------
    public String getISBN()
    {
        return isbn;
    }

    //-----------------------------------------------------------------
    //  Returns a description of this reading matter as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        return (title + "\t" + isbn);
    }

    //-----------------------------------------------------------------
    //  Prints a message appropriate for this reading matter.
    //-----------------------------------------------------------------
    public void content()
    {
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + isbn);
    }
}
