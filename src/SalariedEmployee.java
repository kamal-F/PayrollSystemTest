/**
 * Fig. 10.14: SalariedEmployee.java <br>
 * SalariedEmployee class extends Employee, which implements Payable.
 * @author Deitel & Associates, Inc.
 */
public class SalariedEmployee extends Employee {
	private double weeklySalary;

	/**
	 * four-argument constructor
	 * @param first first name of the employee
	 * @param last last name of the employee
	 * @param ssn SSN of the employee
	 * @param salary the salary the employee
	 */
	public SalariedEmployee(String first, String last, String ssn, 
			double salary) {
		super(first, last, ssn); // pass to Employee constructor
		setWeeklySalary(salary); // validate and store salary
	} // end four-argument SalariedEmployee constructor

	/**
	 * set salary
	 * @param salary the salary of the employee
	 */
	public void setWeeklySalary(double salary) {
		if ( salary >= 0.0 )
			weeklySalary = salary;
		else
			throw new IllegalArgumentException( 
					"Weekly salary must be >= 0.0" );
	} // end method setWeeklySalary

	/**
	 * return salary
	 * @return the salary of the employee
	 */
	public double getWeeklySalary() {
		return weeklySalary;
	} // end method getWeeklySalary

	/**
	 * calculate pay; implement interface Payable method that was
	 * abstract in superclass Employee
	 * @return pay of the employee
	 */
	@Override
	public double getPaymentAmount() {
		return getWeeklySalary();
	} // end method getPaymentAmount

	/**
	 * return String representation of SalariedEmployee object
	 * @return String representation of SalariedEmployee object
	 */
	@Override
	public String toString() {
		return String.format("the salaried employee: %s\n%s: $%,.2f", 
				super.toString(), "weekly salary", this.getWeeklySalary());
	} // end method toString
} // end class SalariedEmployee
