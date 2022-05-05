/* Java Program to find the largest and smallest word in a string.
*/
public class LargestSmalestWard {
    public static void main(String[] args) {
        String string = "Hardships often prepare ordinary people for an extraordinary destiny";    
        String[] str=string.split(" ");
        int numOfWords=str.length,min,max,a=0,b=0;
        int[] count=new int[numOfWords];
        
  for (int i = 0; i < count.length; i++) {
       count[i]=str[i].length();
  }
   
  max=min=count[0];
   for (int i = 1; i < count.length; i++) {
       if (min>count[i]) {
           min=count[i];
           a=i;
       }
   }
   for (int i = 0; i < count.length; i++) {
       if (max < count[i]) {
           max=count[i];
           b=i;
       }
   }
      System.out.println("Smallest word: "+str[a]);
      System.err.println("Longest word: "+str[b]);
   
    }
}
