/*Java Program to find all the permutations of a string*/

import java.util.Scanner;

public class Permutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string=");
        String str = sc.nextLine();
        int len = str.length();
        char[] s = str.toCharArray();
        System.out.println("All posible permutation are:-");
        for (int i = 0; i < len; i++) {
            System.out.println("on swaping:" + s[i] + " with other:-");
            for (int j = 0; j < len; j++) {
                if (j != i) {
                    char temp = s[i]; //swaping to get new
                    s[i] = s[j];
                    s[j] = temp;
                    // for (int k = 0; k < s.length; k++) {
                    //     System.out.print(s[k]);
                    // }
                        
                    System.out.println(String.valueOf(s));  //String.valueOf-->give turn arrayto string
                    temp = s[j];  // swapping to get back older
                    s[j] = s[i];
                    s[i] = temp;
                }
            }
        }
    }
}
/*
 * Enter string=ABC
 * All posible permutation are:-
 * on swaping:A with other:-
 * BAC
 * on swaping:B with other:-
 * BAC
 * ACB
 * on swaping:C with other:-
 * CBA
 * ACB
 */