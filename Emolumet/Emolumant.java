public class Emolumant {
	double basic_salary;
	double tax_relief;
	String companyname = "Pinver Gh";

	public Emolumant(double basic_salary, double tax_relief) {
		this.basic_salary = basic_salary;
		this.tax_relief = tax_relief;
	}

	public double getBasicsalary() {
		return basic_salary;
	}

	public double getTaxRelief() {
		return tax_relief;
	}

	public double SSNIT() {
		return 0.035 * getBasicsalary();
	}

	public double taxableIncome() {
		return getBasicsalary() - (getTaxRelief() + SSNIT());
	}

	public String companyName() {
		return companyname;
	}
}