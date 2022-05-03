
import java.util.Arrays;
import java.util.Scanner;

/* Anagram program:-
1.Two Strings are called the anagram if they contain the same characters. However, the order or sequence of the characters can be different.
*/

public class Anagram {
    public static void main(String[] args) {
        System.out.print("enter string 1=");
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.print("enter string 2=");
        String str2=sc.nextLine();  

        if (str1.length()!= str2.length()) {
            System.out.println("Strings are not Anagram!");
            System.exit(0);
            
        }
//converting all elements to lowercase
        str1.toLowerCase();
        str2.toLowerCase();
//conver string to array
        char[] arry1 =str1.toCharArray();
        char[] arry2=str2.toCharArray();
// sorting array using function
        Arrays.sort(arry1);    
        Arrays.sort(arry2);   

// check equql or not
        if (Arrays.equals(arry1, arry2)) {
            System.out.println("strings are Angram");
            
        }else{
            System.out.println("strings are not Angram");
        }
  

    }
}
/*enter string 1=pankaj ATRI
enter string 2=jaakpn iAtR
strings are Angram*/