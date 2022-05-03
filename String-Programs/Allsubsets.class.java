import java.util.Scanner;

/*Java Program to find all subsets of a string
In this program, all the subsets of the string 
need to be printed. The subset of a string is the 
character or the group of characters that are present inside the string.*/

public class AllSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string=");
        String str = sc.nextLine();
        int len = str.length(), k = 0;

        String[] subsets = new String[len * (len + 1) / 2]; // no. of total possible subsets =n*(n+1)/2

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                subsets[k++] = str.substring(i, j + 1);
            }

        }
        System.out.print("All the pssible Substrings are=");
        for (String i : subsets) {
            System.out.print(i + " ");
        }

    }
}
/*Enter string=PAN
All the pssible Substrings are=P PA PAN A AN N */