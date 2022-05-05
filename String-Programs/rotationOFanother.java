import java.util.Scanner;

/*Java Program to determine whether one string is a rotation of another*/

public class rotationOFanother {
    public static void main(String[] args) {
        System.out.print("Enter string=");
     Scanner sc=new Scanner(System.in);
     String str1=sc.nextLine();
     System.out.print("enter rotating string=");
     String str2=sc.nextLine();

    String str3=str1+str1;
    // if(str3.indexOf(str2) != -1)    
    if(str3.contains(str2))   
    System.out.println("Second string is a rotation of first string");    
    else    
    System.out.println("Second string is not a rotation of first string");    
}       

}

    /*Enter string=abcde
enter rotating string=deabc
Second string is a rotation of first string*/ //abc(deabc)de
