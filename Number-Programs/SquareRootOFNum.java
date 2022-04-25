import java.util.Scanner;

/* Using Newton Raphon Method*/
public class SquareRootOFNum {
    static void giveRoot(double num) {
        double x = num; // absolute root(x)
        for (int i = 0; i < 10; i++) {
            x = (x + num / x) / 2;

        }
        System.out.println("Square Root of " + num + "=" + x);
    }

    public static void main(String[] args) {
        System.out.print("enter num=");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        giveRoot(num);

    }
}



/*enter num=4
Square Root of 4.0=2.0
enter num=2
Square Root of 2.0=1.414213562373095*/
