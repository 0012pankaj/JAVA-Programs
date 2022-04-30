import java.net.SocketImpl;

public class SortDescending{
    public static void main(String[] args) {
        int[] arry ={3,7,4,2,8};
        System.out.print("orignal array=");
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]+" ");
            
        }
          //Sort the array in descending order 
        for (int i = 0; i < arry.length-1; i++) {
            for (int j = 0; j < arry.length-1-i; j++) {
                if (arry[j]<arry[j+1]) {
                    int temp=arry[j];
                    arry[j]=arry[j+1];
                    arry[j+1]=temp;
                }
            }
        }

        System.out.print(" updated array=");
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]+" ");
        }
    }
}
/*orignal array=3 7 4 2 8  updated array=8 7 4 3 2 */