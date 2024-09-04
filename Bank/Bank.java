
import javax.swing.JOptionPane;

public class Bank {
    // Global variable for balance and Scanner class
    double balance = 0;
    

    // Method to show error message in using JOptionPane
    void Error(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", 0);
    }

    // Method to show output message
    void Output(String message, String title, double digit) {
        String output = String.format(message + "GHC %5.2f", digit);
        JOptionPane.showMessageDialog(null, output, title, 1);
    }

    // Method to display balance
    void show_balance() {
        Output("Your current balance is ", "Balance", balance);
    }

    // Method to deposit funds
    void deposit() {
        double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount to deposit:"));

        if (amount > 0) {// Checks whether amount is not negative
            balance += amount;
            Output("Deposit successful!\nAmount entered ", "Deposited", amount);
        } else {
            Error("Amount should be non-negative\nEnter a valid amount");
        }
    }

    // Method to make withdrawal
    void withdraw() {
        double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount to withdraw:"));

        if (amount > 0 && amount <= balance) {// Checks if amount is non-negative and not more than current balance
            balance -= amount;
            Output("Withdrawal successful!\nAmount entered ", "Withdrawn", amount);
        } else {
            if (amount < 0) {// Shows message if amount is negative
                Error("Amount should be non-negative\nEnter a valid amount");
            }
            if (amount > balance) {// Shows error message and prints out current balance if amount is more than
                                   // balance
                Error("Insufficient balance to make withdrawal,\n Check your balance and try again");
            }
        }
    }

    public static void main(String[] args) {
        Bank user = new Bank();

        whileLoop: while (true) {

            int input = Integer.parseInt(JOptionPane.showInputDialog(
                    "\nConsole Banking App\n1.Show Balance\n2.Deposit\n3.Withdraw\n4.Exit\n\nSelect from Options (1-4): "));

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
                    JOptionPane.showMessageDialog("Invalid Input, try again");
                    break;
            }

        }

    }

}
