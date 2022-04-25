/*Duck number is another special positive non-zero number that contains zero in it
. The digit zero should not be presented at the starting of the number. 
Zero can be present at any of the positions except the beginning of the number.
// */

import java.util.Scanner;

public class DuckNumber {
    static void checkDuck(int num) {
        int n = num, r, rev = 0, r2;
        boolean flag = true;
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;

        }
        if (rev % 10 == 0) {
            System.out.println(num + " it is not a duck number containing 0 at starting");
            System.exit(0);
        } else {
            while (rev != 0) {
                r2 = rev % 10;
                if (r2 == 0) {
                    System.out.println(num + " is Duck Number");
                    flag = false;
                    break;
                }
                rev = rev / 10;
            }

        }
        if (flag) {

            System.out.println(num + " is Not A Duck Number");
        }

    }

    public static void main(String[] args) {
        System.out.print(
                "Enter number to check Duck number or not(MAKE SURE THST THE INPUT NUMBER NOT CONTAIN ZERO 0 IN STARTING)=");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        checkDuck(num);
    }

}

// //import required classes and packages
// import java.util.*;
// import java.io.*;
// import java.util.Scanner;

// //create DuckNumberExample class to check whether the given number is a Duck
// number or not
// public class DuckNumber {

// // create checkNumber() method that returns true when it founds number Buzz
// public static boolean checkNumber(int number) {

// // use loop to repeat steps
// while(number != 0) {

// // check whether the last digit of the number is zero or not
// if(number%10 == 0)
// return true; //return true if the number is Duck

// // divide the number by 10 to remove the last digit
// number = number / 10;
// }

// return false; //return false if the number is not Duck
// }
// // main() method start
// public static void main(String args[])
// {
// int n1, n2;

// //create scanner class object to get input from user
// Scanner sc=new Scanner(System.in);

// //show custom message
// System.out.println("Enter first number");

// //store user entered value into variable n1
// n1 = sc.nextInt();

// //show custom message
// System.out.println("Enter second number");

// //store user entered value into variable n2
// n2 = sc.nextInt();

// if (checkNumber(n1))
// System.out.println(n1 + " is a Duck number");
// else
// System.out.println(n1 + " is not a Duck number");
// if (checkNumber(n2))
// System.out.println(n2 + " is a Duck number");
// else
// System.out.println(n2 + " is not a Duck number");
// }
// }
