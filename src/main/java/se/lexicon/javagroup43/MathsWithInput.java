package se.lexicon.javagroup43;

import java.util.Scanner;

public class MathsWithInput
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter a number" );
        n1 = scanner.nextInt();
        System.out.println("Enter a number" );
        n2 = scanner.nextInt();
        System.out.println("Addition " + n1 + "+" +  n2 + "=" +(n1+n2));
        System.out.println("Subtraction " + n1 + "-" +  n2 + "=" +(n1-n2));
        System.out.println("Multiplication " + n1 + "*" +  n2 + "=" +(n1*n2));
        System.out.println("division " + n1 + "/" +  n2 + "=" +(n1/n2));

    }

}


