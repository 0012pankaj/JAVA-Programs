import java.util.Scanner;

public class Primenum {
    public static void main(String[] args) {
        int num, flag = 0;
        System.out.print("Enter number to check prime or not=");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num == 0 || num == 1) {
            System.out.println(num + " is not a prime number");
        } else {
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }

            }
            if (flag == 0) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prme number.");
            }
        }

    }
}
