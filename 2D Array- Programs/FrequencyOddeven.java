import java.util.Scanner;

public class FrequencyOddeven {

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
        int odd = 0, even = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arry[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }

            }
               
        }
        System.out.println("frequency of even :- "+even);
        System.out.println("frequency of odd :- "+odd);
    }
}
/* enter no. of raws=3
enter no. of columns=3
Enter elements in matrix:-
1 2 3
1 2 3
1 2 3
frequency of even :- 3
frequency of odd :- 6*/