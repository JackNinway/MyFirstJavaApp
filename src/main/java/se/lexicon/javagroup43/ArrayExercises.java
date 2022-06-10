package se.lexicon.javagroup43;
import java.util.Arrays;
import java.util.Formatter;
public class ArrayExercises {

public static void RemoveDuplicate() {
    int[] aN1 = {20, 20, 40, 20, 30, 40, 50, 60, 50};
    Arrays.sort(aN1);
    int[] aCleaned = new int[aN1.length];
    int j=0;
    for (int i = 0; i < aN1.length - 1; i++) {
        if (aN1[i] != aN1[i + 1]) {
            aCleaned[j++] = aN1[i];
        }
    }
    aCleaned[j++] = aN1[aN1.length - 1];
    System.out.print("     \n Removing duplicates \n   ");

    for (int i = 0; i < j; i++)
        System.out.print(aCleaned[i] + " ");

}
//Average of values in an array
public static void PrintUnEven(){
        int aN1 []  ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("       Odd numbers:       " );
        for(int i=0; i< aN1.length; i++) {
            if((aN1[i] % 2) != 0)
               System.out.print(" " + aN1[i]);
        }
    }
//Average of values in an array
public static void AverageOfArray(){
    int aN1 []  ={43, 5, 23, 17, 2, 14};
    float  average=0, sum=0;
    for(int i=0; i< aN1.length; i++)
       sum = sum + aN1[i];
    average = sum / aN1.length;
    System.out.printf("\n The average is:   %.1f\n", average);
}

// 2 dimensional string array
    public static void TwoDStringArray()   {
        String[] []  strArr = new String[2] [2];

        strArr[1][0] = "France";
        strArr[1][1] ="Paris";
        System.out.println(Arrays.deepToString(strArr));
//or by for loop
        strArr[1][0] = "Norway";
        strArr[1][1] ="Oslo";
        for (int i=0; i < strArr.length; i++){
            for(int j=0; j < strArr[i].length; j++)
                System.out.print(strArr[i][j] );
            }
        }

// Copy elements of an array to another
    public static void CopyElements(){
        int aN1 []  ={1, 3, 5,7};
        String s ;
        int[] aN2  ={2, 4, 6, 8};;
        aN2 = Arrays.copyOf(aN1,3);
        System.out.println(Arrays.toString(aN2));


    }
    //  sort an array of string
    public static void SortStringArray(){
        String s1,  sS;
        String s[] = {"Paris", "london", "New York", "Stockholm"};
        System.out.println(Arrays.toString(s));
        Arrays.sort(s, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(s));
    }

    public static int indexOf(int rc) {
        int[] myIntArray = {4, 8, 16, 32, 64};
        int  c=0;
        while (c < 5) {
            if (myIntArray[c] == rc) {
                return c;
            }
            else
                c++;
        }
        return -1;
    }
    public static void main(String[] args) {
//      ArrayExercises arr = new ArrayExercises();
        int retIndex = indexOf(16);
        System.out.println("Index position of number  is " + retIndex);
        SortStringArray();
        CopyElements();
        TwoDStringArray();
        AverageOfArray();
        PrintUnEven();
        RemoveDuplicate();
    }
}





