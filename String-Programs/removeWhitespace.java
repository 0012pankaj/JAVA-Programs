/*Java Program to remove all the white spaces from a string*/

import java.util.Scanner;

public class removeWhitespace {
    public static void main(String[] args) {
        System.out.print("Enter string=");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // removing all white space
        str = str.replace(" ", "");
        System.out.print("Updated string =" + str);
    }
}
/*
 * Enter string=my name is pankaj
 * Updated string =mynameispankaj
 */
