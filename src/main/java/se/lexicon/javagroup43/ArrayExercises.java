package se.lexicon.javagroup43;
import java.util.Arrays;

public class ArrayExercises {

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
    }
}





