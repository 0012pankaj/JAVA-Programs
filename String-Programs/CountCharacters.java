/* Java Program to count the total number of characters in a string*/

import java.util.Scanner;

public class CountCharacters{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter string:-"); 
        String str=sc.nextLine();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) !=' ') {
                count++;
            }
            
        }
        System.out.print("total No. charecters in string:-"+count);
    }
}
/*Enter string:-my name is pankaj
total No. charecters in string:-14*/