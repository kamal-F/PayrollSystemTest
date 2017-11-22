/**
 * Fig. 10.8: BasePlusCommissionEmployee.java <br>
 * BasePlusCommissionEmployee class extends CommissionEmployee.
 * @author Deitel & Associates, Inc.
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary; // base salary per week

	/**
	 * six-argument constructor
	 * @param first first name of employee
	 * @param last last name of employee
	 * @param ssn SSN of employee
	 * @param sales total sales of employee
	 * @param rate commission rate of employee
	 * @param salary base salary of employee
	 */
	public BasePlusCommissionEmployee(String first, String last, 
			String ssn, double sales, double rate, double salary) {
		super(first, last, ssn, sales, rate);
		setBaseSalary(salary); // validate and store base salary
	} // end six-argument BasePlusCommissionEmployee constructor

	/**
	 * set base salary
	 * @param salary base salary of employee
	 */
	public void setBaseSalary(double salary) {
		if (salary >= 0.0)
			baseSalary = salary;
		else
			throw new IllegalArgumentException( 
					"Base salary must be >= 0.0" );
	} // end method setBaseSalary

	/**
	 * return base salary
	 * @return base salary of employee
	 */
	public double getBaseSalary() {
		return baseSalary;
	} // end method getBaseSalary

	/**
	 * calculate pay; override method getPaymentAmount in CommissionEmployee
	 * @return pay of employee
	 */
	@Override
	public double getPaymentAmount() {
		return getBaseSalary() + super.getPaymentAmount();
	} // end method getPaymentAmount

	/**
	 * return String representation of BasePlusCommissionEmployee object
	 * @return String representation of BasePlusCommissionEmployee object
	 */
	@Override
	public String toString() {
		return String.format("%s %s; %s: $%,.2f", 
				"base-salaried", super.toString(), 
				"base salary", getBaseSalary());
	} // end method toString   
} // end class BasePlusCommissionEmployee
