package se.lexicon.javagroup43;

class Car {
    String brand;
    String regNr;
    int maxSpeed;
    String owner;
    String color;

   public Car(String b, String r, int s, String o, String c) {
       brand=b;
       regNr=r;
       maxSpeed=s;
       owner=o;
       color=c;

   }

    public String myCarInfo()
        {
            return brand +'\n' +regNr +'\n' +maxSpeed +'\n' +owner +'\n' +color;
        }
}
public class Main
{

    public static void main(String[] args)
    {
        Car myCar = new Car ("VW", "DZR 523", 111, "Jack", "blue");
//addition exercise
        double n1, n2, res;
        n1 = 1.2;
        n2 = 2.3;
        res= n1 + n2;
        System.out.println(res);
       System.out.println(myCar.myCarInfo());
        //        System.out.print("Hello" +'\n' +"Jack"); //

// score exercise
        int number = 5;
        do {
            number++;
        }while(number != 0 && number < 5);
        System.out.println(number);
    }
}
