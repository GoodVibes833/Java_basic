package Lec7.ReadingMaterialEx;//********************************************************************
//  TextBook.java       Java Foundations
//
//  Solution to Programming Project 8.3 
//********************************************************************

public class TextBook extends Book
{
    protected boolean answers;  // are answers provided with the book

    //-----------------------------------------------------------------
    //  Sets up this textbook with the specified information.
    //-----------------------------------------------------------------
    public TextBook(String thisTitle, String isbnNum, String auth,
            boolean ans)
    {
        super(thisTitle, isbnNum, auth);
        answers = ans;
    }

    //-----------------------------------------------------------------
    //  Sets whether the answers are provided for this textbook.
    //-----------------------------------------------------------------
    public void setAnswers(boolean ans)
    {
        answers = ans;
    }

    //-----------------------------------------------------------------
    //  Returns whether the answers are provided for this textbook.
    //-----------------------------------------------------------------
    public boolean getAnswers()
    {
        return answers;
    }

    //-----------------------------------------------------------------
    //  Returns a description of this textbook as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = super.toString();
        if (!answers)
            result += "no ";
        result += "answers given";
        return result;
    }

    //-----------------------------------------------------------------
    //  Prints a message appropriate for this textbook.
    //-----------------------------------------------------------------
    public void content()
    {
        super.content();
        System.out.println("Answers provided: " + answers);
    }
}
