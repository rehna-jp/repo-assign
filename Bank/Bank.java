import java.util.Scanner;

public class Bank {
    // Global variable for balance and Scanner class
    double balance = 0;
    Scanner input = new Scanner(System.in);

    // Method to display balance
    void show_balance() {
        System.out.printf("Your balance is GHC %5.2f", balance);
    }

    // Method to deposit funds
    void deposit() {
        System.out.print("Enter amount for deposit: ");
        double amount = input.nextDouble();

        if (amount > 0) {// Checks whether amount is not negative
            balance += amount;
            System.out.printf("GHC %5.2f has been deposited to your account", amount);
        } else {
            System.out.println("Amount should be non-negative\nEnter a valid amount");
        }
    }

    // Method to make withdrawal
    void withdraw() {
        System.out.println("Enter amount to withdraw");
        double amount = input.nextDouble();

        if (amount > 0 && amount <= balance) {// Checks if amount is non-negative and not more than current balance
            balance -= amount;
            System.out.printf("GHC %5.2f has been withdrawn from your account", amount);
        } else {
            if (amount < 0) {// Shows message if amount is negative
                System.out.println("Amount should be a non-negative number");
            }
            if (amount > balance) {// Shows error message and prints out current balance if amount is more than
                                   // balance
                System.out.println("Insufficient balance to make withdrawal");
                System.out.printf("Your current balance is GHC %5.2f", balance);
            }
        }
    }

    public static void main(String[] args) {
        Bank user = new Bank();

        whileLoop: while (true) {
            System.out.println(
                    "\nConsole Banking App \n1.Show Balance \n2.Deposit \n3.Withdraw \n4.Exit \n \nSelect from Options(1-4)");

            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    user.show_balance();
                    break;
                case 2:
                    user.deposit();
                    break;
                case 3:
                    user.withdraw();
                    break;
                case 4:

                    break whileLoop;

                default:
                    System.out.println("Invalid Input");
                    break;
            }

        }

    }

}