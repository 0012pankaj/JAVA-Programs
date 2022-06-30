import java.util.*;
import java.io.*;

class easy6series{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=a+b;
            System.out.print(sum+" ");
            int j = 2;
            for (int k=1; k < n; k++) {
                 sum+=j*b;
                System.out.print(sum+" ");
                j*=2;
            }
            System.out.println();
        }
        in.close();
    }
}