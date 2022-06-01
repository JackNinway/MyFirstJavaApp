package se.lexicon.javagroup43;
import java.util.Scanner;

public class LeapOrNot
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        int nYear;
        System.out.println("Which year is it?" );
        nYear = scanner.nextInt();
        LoN(nYear);
    }

    public static void LoN(int yNr)
    {

        if ((yNr % 4) > 0) //leap ??
        {
            System.out.println("Year " +yNr+ " is NOT a leap year" );
        }
        else
        {
            System.out.println("Year " +yNr+ "IS a leap year" );
        }
    }
}
