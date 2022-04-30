
import java.util.Scanner;

public class ThirdLargest {
    static void givethirdLargest(int arry[], int size) {
        int m1 = arry[0], m2 = 0, m3 = 0;
        for (int i = 1; i < arry.length; i++) {
            if (arry[i] > m1) {
                m3 = m2;
                m2 = m1;
                m1 = arry[i];

            }
        }
        System.out.println("Third largest= " + m3);
    }

    public static void main(String[] args) {
        System.out.print("Enter size=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arry[] = new int[size];
        System.out.print("Enter elements in array=");
        for (int i = 0; i < arry.length; i++) {
            arry[i] = sc.nextInt();
        }

        givethirdLargest(arry, size);
    }
}
/*Enter size=5
Enter elements in array=21 43 65 87 90
Third largest= 65*/