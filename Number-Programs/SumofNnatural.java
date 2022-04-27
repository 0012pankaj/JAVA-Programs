import java.util.Scanner;

public class SumofNnatural {
    public static void main(String[] args) {
        System.out.println("Enter limit upto which you want sum=");
        Scanner sc = new Scanner(System.in);
        int sum = 0, n = sc.nextInt();
        sum = n * (n + 1) / 2; /* sum of natural number formula */
        System.out.println(sum);
    }
}
