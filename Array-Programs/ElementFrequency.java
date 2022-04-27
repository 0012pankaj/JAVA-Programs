/* Java Program to find the frequency of each element in the array*/
/*time comlexity=o(n^2)*/

import java.util.Scanner;

public class ElementFrequency {
    static void Givefrequency(int arry[], int size) {

        int visit[] = new int[arry.length];
        for (int i = 0; i < arry.length; i++) {
            int count = 1;
            if (visit[i] == 1) {
                continue;
            }
            for (int j = i + 1; j < arry.length; j++) {

                if (arry[i] == arry[j]) {
                    count++;
                    visit[j] = 1;
                }
            }

            System.out.println(arry[i] + " comes " + count + " Times.");
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter size=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arry[] = new int[size];
        System.out.print("enter elements=");
        for (int i = 0; i < size; i++) {
            arry[i] = sc.nextInt();
        }
        Givefrequency(arry, size);

    }
}
