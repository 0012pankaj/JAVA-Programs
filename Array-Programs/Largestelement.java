import java.util.Scanner;

/*Program to print the largest element in an array*/

public class Largestelement {
    static int LargestElement(int arry[], int size) {
        int max = arry[0];
        for (int i = 1; i < arry.length; i++) {
            if (max < arry[i]) {
                max = arry[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.print("Enter size=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arry[] = new int[size];
        System.out.print("Enter elementes in array=");
        for (int i = 0; i < size; i++) {
            arry[i] = sc.nextInt();
        }
        System.out.print("largest element=" + LargestElement(arry, size));

    }
}
/*
 * Enter size=5
 * Enter elementes in array=11 33 55 88 33
 * largest element=88
 */
