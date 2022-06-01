package se.lexicon.javagroup43;

import java.util.Scanner;

public class StringExercise
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("What is your name?" );
        name = scanner.nextLine();  // Read user input
        System.out.println("Hello " + name +".");  // Output user input
    }

}
