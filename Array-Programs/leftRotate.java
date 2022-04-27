import java.util.Scanner;

public class leftRotate {
    static void giveLeftRotation(int arry[], int size, int n) {
        while (n > 0) {
            int n1 = arry[0];
            for (int i = 0; i < size - 1; i++) {
                arry[i] = arry[i + 1];
            }
            arry[size - 1] = n1;
            n--;
        }
        System.out.print("Updated array after " + n + "rotation.=");
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]+" ");
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
        System.out.print("Enter number of times you want to rotate array left=");
        int n = sc.nextInt();
        giveLeftRotation(arry, size, n);
    }
}

/*Enter size=5
Enter elements in array=1 2 3 4 5
Enter number of times you want to rotate array left=2
Updated array after 0rotation.=3 4 5 1 2 */