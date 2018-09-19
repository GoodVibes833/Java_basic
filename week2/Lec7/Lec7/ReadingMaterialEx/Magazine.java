package Lec7.ReadingMaterialEx;//********************************************************************
//  Magazine.java       Java Foundations
//
//  Solution to Programming Project 8.3 
//********************************************************************

public class Magazine extends ReadingMaterial
{
    protected String editor;

    //-----------------------------------------------------------------
    //  Sets up this magazine with the specified information.
    //-----------------------------------------------------------------
    public Magazine(String thisTitle, String isbnNum, String ed)
    {
        super(thisTitle, isbnNum);
        editor = ed;
    }

    //-----------------------------------------------------------------
    //  Sets the editor for this magazine.
    //-----------------------------------------------------------------
    public void setEditor(String ed)
    {
        editor = ed;
    }

    //-----------------------------------------------------------------
    //  Returns the editor for this magizine.
    //-----------------------------------------------------------------
    public String getEditor()
    {
        return editor;
    }

    //-----------------------------------------------------------------
    //  Returns a description of this magazine as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = super.toString();
        result += "\t" + editor;
        return result;
    }

    //-----------------------------------------------------------------
    //  Prints a message appropriate for this magazine.
    //-----------------------------------------------------------------
    public void content()
    {
        super.content();
        System.out.println("Editor: " + editor);
    }
}
