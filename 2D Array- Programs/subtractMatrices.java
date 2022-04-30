import java.util.Scanner;

public class subtractMatrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter NO. of raws=");
        int r = sc.nextInt();
        System.out.print("Enter NO. of columns=");
        int c = sc.nextInt();
        int arry1[][] = new int[r][c];
        int arry2[][] = new int[r][c];
        int arry3[][] = new int[r][c];

        System.out.println("Enter elements raw wise matrix 1:-");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arry1[i][j] = sc.nextInt();

            }

        }
        System.out.println("Enter elements raw wise matrix 2:-");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arry2[i][j] = sc.nextInt();

            }

        }
        System.out.println("On Subtracting of matrix 1 and 2:-");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arry3[i][j] = arry1[i][j] - arry2[i][j]; // doing sum
                System.out.print(arry3[i][j] + " ");
            }
            System.out.println();

        }
    }
}
/* Enter NO. of raws=3
Enter NO. of columns=3
Enter elements raw wise matrix 1:-
3 3 3
3 3 3
3 3 3
Enter elements raw wise matrix 2:-
1 1 1
1 1 1
1 1 1
On Subtracting of matrix 1 and 2:-
2 2 2
2 2 2
2 2 2 */