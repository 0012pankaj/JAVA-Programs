/*Java Program to remove duplicate element in an Array*/

import java.util.Scanner;

public class DeletDuplicate {
    static void DeletDuplicateElement(int arry[], int size) {

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arry[i] == arry[j]) {
                    for (int j2 = j; j2 < size - 1; j2++) {
                        arry[j2] = arry[j2 + 1];
                    }
                    j--;
                    size--;
                }
            }
        }

        System.out.print("Updated array=");
        for (int i = 0; i < size; i++) {
            System.out.print(arry[i] + " ");
        }

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

        DeletDuplicateElement(arry, size);

    }
}

/*
 * Enter size=8
 * Enter elements in array=1 2 2 3 4 5 5 6
 * Updated array=1 2 3 4 5 6
 */
/*
 * Enter size=10
 * Enter elements in array=1 1 2 2 3 3 4 4 5 5
 * Updated array=1 2 3 4 5
 */
