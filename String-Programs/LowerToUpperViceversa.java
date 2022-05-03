import java.util.Scanner;

public class LowerToUpperViceversa {
    public static void main(String[] args) {
        System.out.print("Enter string:");
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
       
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
               str= str.replace(str.charAt(i),Character.toUpperCase(str.charAt(i)));
                
            }else if (Character.isUpperCase(str.charAt(i))) {
              str=  str.replace(str.charAt(i),Character.toLowerCase(str.charAt(i)));
                
            }
        }
 System.out.println("Updated string: "+str);

    }
}
/*Enter string:PaNkAj AtrI  
Updated string: pAnKAJ ATRi*/
