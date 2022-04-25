/* A number is called an emirp number if we get another prime 
number on reversing the number itself. In other words, an emirp number is a number that
 is prime forwards or backward. It is also known as twisted prime numbers. */
/*Enter number to check Emirp or not=79
79 is an Emirp Number.*/
/*Enter number to check Emirp or not=19
Cant check reverse of a number is not prime number*/     /*@pankaj0012*/


import java.util.Scanner;

public class EmirpNumber {
    static void checkEmirp(int num) {
        Boolean flag = true;
        int n = num, rev = 0, r = 0;
        for (int i = 2; i < num / 2; i++) {

            if (num % i == 0) {
                System.out.println("Cant check it is not prime number");
                flag = false;
                break;
            } else {

                flag = true;
            }

        }
        if (flag) {
            while (n > 0) {
                r = n % 10;
                rev = rev * 10 + r;
                n = n / 10;
            }
            for (int i = 2; i < rev / 2; i++) {

                if (rev % i == 0) {
                    System.out.println("Cant check reverse of a number is not prime number");
                    flag = false;
                    System.exit(0);;
                } else {

                    flag = true;
                }

            }
            if (flag) {
                System.out.println(num + " is an Emirp Number.");
            } else {
                System.out.println(num + " is Not an Emirp Number.");
            }

        }

    }

    public static void main(String[] args) {
        System.out.print("Enter number to check Emirp or not=");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkEmirp(num);
    }

}