package Lec7.ReadingMaterialEx;//********************************************************************
//  Novel.java       Java Foundations
//
//  Solution to Programming Project 8.3 
//********************************************************************

public class Novel extends Book
{
    protected String[] characters;

    //-----------------------------------------------------------------
    //  Sets up this novel with the specified information.
    //-----------------------------------------------------------------
    public Novel(String thisTitle, String isbnNum, String auth,
            String[] chars)
    {
        super(thisTitle, isbnNum, auth);
        characters = chars;
    }

    //-----------------------------------------------------------------
    //  Sets the cast of characters for this novel.
    //-----------------------------------------------------------------
    public void setCharacters(String[] chars)
    {
        characters = chars;
    }

    //-----------------------------------------------------------------
    //  Returns the cast of characters for this novel.
    //-----------------------------------------------------------------
    public String[] getCharacters()
    {
        return characters;
    }

    //-----------------------------------------------------------------
    //  Returns a description of this novel as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = super.toString();

        for (int index = 0; index < characters.length; index++)
            result += "\n" + characters[index];

        return result;
    }

    //-----------------------------------------------------------------
    //  Prints a message appropriate for this novel.
    //-----------------------------------------------------------------
    public void content()
    {
        super.content();
        for (int index = 0; index < characters.length; index++)
            System.out.println (characters[index]);
    }
    public void priceTag() {
        System.out.println("$154.70");
    }
}
