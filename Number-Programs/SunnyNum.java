import java.util.Scanner;

/*A number is called a sunny number if the number next to the 
given number is a perfect square. In other words, 
a number N will be a sunny number if N+1 is a perfect square.
Given, N=80 then N+1 will be 80+1=81, 
which is a perfect square of the number 9. Hence 80 is a sunny number.*/
/* @pankaj0012*/


public class SunnyNum {
    static void checkSunny(int n) {
        
        int n1 = n + 1;
        double m = 0;
        m = Math.sqrt(n1);
        //System.out.println(m);
        //System.out.println(Math.floor(m));
    if((m-Math.floor(m))==0)
    {
        System.out.println(" it is sunny number");
    }else
    {
        System.out.println(" it is not sunny number");
    }
    }
    public static void main(String[] args) {
        System.out.print("Enter number to check sunny or not=");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkSunny(num);
    }
}

/*Enter number to check sunny or not=8
3.0
3.0
 it is sunny number*/

/*  Enter number to check sunny or not=7
2.8284271247461903
2.0
 it is not sunny number*/