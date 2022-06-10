package se.lexicon.javagroup43;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int ranNr =1, inputNr = 3, nGuess=0;


        while (ranNr != inputNr)
        {
            ranNr = rand.nextInt(500);
            ranNr += 1;
            System.out.println("Enter a number between 1 and 500" );
            inputNr = scanner.nextInt();
            nGuess++;
            if (inputNr==ranNr)
                System.out.println("Your guess was correct at the " + nGuess + "trial");
            else if ( inputNr>ranNr )
                System.out.println("Your guess was to high, guess nr:" + nGuess);
            else
                System.out.println("Your guess was to low, guess nr:" + nGuess);
            System.out.println("Correct number is: " +ranNr );
        }
    }
}