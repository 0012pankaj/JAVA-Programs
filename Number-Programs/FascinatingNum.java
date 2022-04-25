/* multiplying a number by two and three separately, the number
 obtained by writing the results obtained with the given number
  will be called a fascinating number. If the result
 obtained after concatenation contains all digits from 1 to 9, exactly once.
 "327"+"654"+ "981"= 327654981
 For example, 192, 1920, 2019, 327 */             /*@pankaj0012*/


import java.util.Scanner;

public class FascinatingNum {
    static void checkFasicinating(int num) {
        int n1, n2;
        n1 = num * 2;
        n2 = num * 3;
        String str = num + "" + n1 + "" + n2;
        boolean flag = true;
        for (char i = '1'; i <= '9'; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (i == str.charAt(j)) {
                    count++;

                }

            }
            if (count > 1 || count == 0) {
                flag = false;
            }

        }
        if (flag) {
            System.out.println(num + " is fansinating number.");
        } else {
            System.out.println(num + " is Not fansinating number.");
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter number to check fascinating or not=");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkFasicinating(num);
    }

}
