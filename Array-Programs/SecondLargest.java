import java.util.Scanner;

public class SecondLargest {
    static void  givesecondLargest(int arry[], int size){

        int m1 = arry[0], m2 = 0;
        for (int i = 1; i < arry.length; i++) {
            if (arry[i] > m1) {
         
                m2 = m1;
                m1 = arry[i];

            }
        }
        System.out.println("second largest= " + m2);

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

    givesecondLargest(arry, size);
}
}
/*Enter size=5
Enter elements in array=11 33 66 87 43
second largest= 66*/