public  class CheckShorted{
    /* check array is strictly shorted or not   1 2 3 4 5--->strictly shorted 1 2 3 3 4 5---> not strictly shorted*/
    public static boolean checkshot(int[] arry,int i){
        if (i==arry.length-1) {
            return true;
        }

        if (arry[i]<arry[i+1]) {
          return  checkshot(arry,i+1);
        }else{
            return false;
        }
       
       
    }
    public static void main(String[] args) {
        int arry[]={1,2,3,4,5};
        
      System.out.println(checkshot(arry,0));
    }
}
/*  int arry[]={1,2,3,4,5};---->true
int arry[]={1,2,3,3,4,5};---->false*/