public class Elementcopy {
    public static void main(String[] args) {
        int arry1[] = { 1, 2, 3, 4, 5 };
        int arry2[] = new int[arry1.length];
        for (int i = 0; i < arry1.length; i++) {
            arry2[i] = arry1[i]; // copy element

        }
        // print array1 elements
        System.out.print("Elements of array 1 =");
        for (int i = 0; i < arry1.length; i++) {
            System.out.print(arry1[i] + " ");
        }
        // print array2 elements
        System.out.println();
        System.out.print("Elements of array 2  =");
        for (int i = 0; i < arry2.length; i++) {
            System.out.print(arry2[i] + " ");
        }
    }

}
