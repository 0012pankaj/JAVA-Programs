
import java.util.Scanner;

public class ATMprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Balance = 100000, key, wit, dip;
        while (true) {
            System.out.println();
            System.out.println(" ! WELCOME TO ATM !");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.println("Choose the give option and enter the given Key:-");

            key = sc.nextInt();
            switch (key) {
                case 1:
                    System.out.print("Enter amount for withdrow:");
                    wit = sc.nextInt();
                    if (wit <= Balance) {

                        Balance -= wit;
                        System.out.println("COLLECT YOUR MONEY!");
                    } else {
                        System.out.println("INSUFFICIENT BALANCE!:" + Balance);
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter amount for deposit:");
                    dip = sc.nextInt();
                    Balance += dip;
                    System.out.println("YOUR AMOUNT IS DIPOSITED SUCCESSFULY!");
                    System.out.println();
                    break;

                case 3:
                    System.out.print("YOUR BALANCE IS:" + Balance);
                    System.out.println();
                    break;

                case 4:
                    System.exit(0);

                    break;

            }

        }
    }
}

/*
 * ! WELCOME TO ATM !
 * Choose 1 for Withdraw
 * Choose 2 for Deposit
 * Choose 3 for Check Balance
 * Choose 4 for EXIT
 * Choose the give option and enter the given Key:-
 * 1
 * Enter amount for withdrow:50000
 * COLLECT YOUR MONEY!
 * 
 * 
 * ! WELCOME TO ATM !
 * Choose 1 for Withdraw
 * Choose 2 for Deposit
 * Choose 3 for Check Balance
 * Choose 4 for EXIT
 * Choose the give option and enter the given Key:-
 * 3
 * YOUR BALANCE IS:50000
 * 
 * ! WELCOME TO ATM !
 * Choose 1 for Withdraw
 * Choose 2 for Deposit
 * Choose 3 for Check Balance
 * Choose 4 for EXIT
 * Choose the give option and enter the given Key:-
 * 2
 * Enter amount for deposit:150000
 * YOUR AMOUNT IS DIPOSITED SUCCESSFULY!
 * 
 * 
 * ! WELCOME TO ATM !
 * Choose 1 for Withdraw
 * Choose 2 for Deposit
 * Choose 3 for Check Balance
 * Choose 4 for EXIT
 * Choose the give option and enter the given Key:-
 * 3
 * YOUR BALANCE IS:200000
 * 
 * ! WELCOME TO ATM !
 * Choose 1 for Withdraw
 * Choose 2 for Deposit
 * Choose 3 for Check Balance
 * Choose 4 for EXIT
 * Choose the give option and enter the given Key:-
 * 4
 * PS C:\Users\HP\Desktop\DESKTOP\JABARDAS CODES\Number-Programs>
 */



