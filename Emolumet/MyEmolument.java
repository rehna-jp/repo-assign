public class MyEmolument extends Emolumant {

	public MyEmolument(double basic_salary, double tax_relief) {
		super(basic_salary, tax_relief);
	}

	public double incomeTax() {
		if (taxableIncome() <= 500) {
			return taxableIncome() * 0.05;
		} else if (taxableIncome() <= 1000) {
			return (500 * 0.05) + (taxableIncome() - 500) * 0.125;
		} else {
			return (500 * 0.05) + (500 * 0.125) + (taxableIncome() - 1000) * 0.175;
		}
	}

	public double totalDeduction() {
		return SSNIT() + incomeTax();
	}

	public double netSalary() {
		return getBasicsalary() - totalDeduction();
	}
}