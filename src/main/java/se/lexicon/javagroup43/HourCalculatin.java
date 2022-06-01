package se.lexicon.javagroup43;
import java.util.Scanner;

public class HourCalculatin
{
    public static void main(String[] args)
    {


        Scanner scanner = new Scanner(System.in);
        int n1, h, m, s;
        System.out.println("Enter time in seconds" );
        n1 = scanner.nextInt();
        h = n1 / 3600;
        m = (n1 % 3600) / 60;
        s = n1 % 60;
        System.out.println( "The time is "+h + ":" + m + ":" + s);

    }

}
