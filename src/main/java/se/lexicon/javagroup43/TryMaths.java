package se.lexicon.javagroup43;

public class TryMaths
{
    public static void main(String[] args)
    {
        int n1=12, n2=4, n3=8, result;
        System.out.println("Try math with: n1=12   n2=4  n3=8"); //

        System.out.println("Addition " + n1 + "+" +  n2 + "=" +(n1+n2));
        System.out.println("Subtraction " + n1 + "-" +  n2 + "=" +(n1-n2));
        System.out.println("Multiplication " + n1 + "*" +  n2 + "=" +(n1*n2));
        System.out.println("division " + n1 + "/" +  n2 + "=" +(n1/n2));

        result = (n1+n2+n3)/3;
        System.out.println("Average of " + n1 + " "
                                         + n2 + " "
                                         + n3 +" = " + result ); //

    }

}
