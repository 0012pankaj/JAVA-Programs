import java.io.*;
import java.util.*;

public class stringtoken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
     s= s.replace(',',' ');
      s= s.replace('?',' ');
        s=s.replace('_',' ');
       s=s.replace('.' ,' ');       
       s=s.replace('@', ' ');
        
        String[] s1=s.split(" ");
        System.out.println(s1.length);
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }
        scan.close();
    }
}

//He is a very very good boy, isn't he?
