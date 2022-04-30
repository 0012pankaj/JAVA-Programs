import java.util.Scanner;

public class UpperTriangle {
    public static void main(String[] args) {
        System.out.print("enter no. of raws=");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.print("enter no. of columns=");
        int c = sc.nextInt();
        int arry[][] = new int[r][c];
        System.out.println("Enter elements in matrix:-");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arry[i][j] = sc.nextInt();

            }

        }
        System.out.println("Lower triangle matrix:-");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (j >= i) {
                    System.out.print(arry[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }

            }
            System.out.println();

        }
    }
}
/*enter no. of raws=3
enter no. of columns=3
Enter elements in matrix:-
1 1 1
1 1 1
1 1 1
Lower triangle matrix:-
1 1 1
0 1 1
0 0 1    */