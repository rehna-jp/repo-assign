import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        double bs = Double.parseDouble(JOptionPane.showInputDialog("Enter basic salary"));
        double tr = Double.parseDouble(JOptionPane.showInputDialog("Enter tax relief"));

        MyEmolument Staff_Salary = new MyEmolument(bs, tr);

        double st = Staff_Salary.SSNIT();
        double ti = Staff_Salary.taxableIncome();
        double ic = Staff_Salary.incomeTax();
        double td = Staff_Salary.totalDeduction();
        double ns = Staff_Salary.netSalary();

        String output = String.format(
                "Basic Salary: GHC %5.2f\nTax Relief: GHC %5.2f\nSSNIT Contribution: GHC %5.2f\nTaxable Income: GHC %5.2f\nIncome Tax: GHC %5.2f\nTotal Deduction: GHC %5.2f\nNet Salary: GHC %5.2f",
                bs, tr, st, ti, ic, td, ns);

        JOptionPane.showMessageDialog(null, output, "Result", 1);

    }

}