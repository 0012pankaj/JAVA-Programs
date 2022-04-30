import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NO. of raws=");
        int r = sc.nextInt();
        System.out.print("Enter NO. of columns=");
        int c = sc.nextInt();
        int arry[][] = new int[r][c];
        System.out.println("Enter elements raw wise:-");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arry[i][j] = sc.nextInt();

            }

        }
        System.out.println("Entered Array:-");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arry[i][j] + " ");

            }
            System.out.println();
        }

    }

}
// Enter NO. of raws=3
// Enter NO. of columns=3
// Enter elements raw wise:-
// 1 2 3
// 1 2 3
// 1 2 3
// Entered Array:-
// 1 2 3
// 1 2 3
// 1 2 3