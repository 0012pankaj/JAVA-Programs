import java.util.Scanner;

/*Java Program to Count the Total Number of Punctuation Characters Exists in a String*/
/*punctuation marks (!, . , ' , - , " , ? , ; )*/

public class PunctuationCharacters {
    public static void main(String[] args) {
        System.out.print("Enter string=");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==','||str.charAt(i)=='.'||str.charAt(i)=='\"'||str.charAt(i)=='-'||str.charAt(i)=='\''||str.charAt(i)==';'||str.charAt(i)=='!'||str.charAt(i)=='?') {
                count++;
            }
        }
        System.out.println("Total number of punctuation marks used:- "+count);
    }
}
/*Enter string=pankaj; kha! h- ya .nhi
Total number of punctuation marks used:- 4*/
