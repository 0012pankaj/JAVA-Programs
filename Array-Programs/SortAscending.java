/*Java Program to sort the elements of an array in ascending order*/

import java.util.Scanner;

public class SortAscending {
    static void ascendingSort(int arry[], int size) {
        for (int i = 0; i < arry.length-1; i++) {
            for (int j = 0; j < arry.length-1-i; j++) {
                if (arry[j] > arry[j+1]) {
                    int temp = arry[j+1];
                    arry[j+1] = arry[j];
                    arry[j] = temp;
                }
            }
        }
        System.out.print("Sorted ((ascending )array=");
        for (int i = 0; i < size; i++) {
            System.out.print(arry[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter size=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arry = new int[size];

        System.out.print("Enter elments in array=");
        for (int i = 0; i < size; i++) {
            arry[i] = sc.nextInt();
        }
        ascendingSort(arry, size);
    }
}
/*Enter size=5
Enter elments in array=3 2 4 1 5
Sorted ((ascending )array=1 2 3 4 5 */