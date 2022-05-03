import java.util.Scanner;

public class countVowelandConst {
    public static void main(String[] args) {
    System.out.print("Enter string=");
    Scanner sc= new Scanner(System.in);
    String str= sc.nextLine();
    int vowel=0,consonants=0;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) !=' '&&str.charAt(i)!=','&&str.charAt(i)!='.'&&str.charAt(i)!='\"'&&str.charAt(i)!='-'&&str.charAt(i)!='\''&&str.charAt(i)!=';'&&str.charAt(i)!='!'&&str.charAt(i)!='?')  {
            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
                vowel++;
            }else{
                consonants++;
            }
            
        }
    }
    System.out.println("Total number of Vowel = "+vowel);
    System.out.println("Total number of consonants = "+consonants);
    }
    
}
/*Enter string=abc! def, ghi' jkl. MNO? PQR" stu vwx yz
Total number of Vowel = 5
Total number of consonants = 21*/
