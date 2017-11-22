/**
 * Fig. 10.6: HourlyEmployee.java <br>
 * HourlyEmployee class extends Employee.
 * @author Deitel & Associates, Inc.
 */
public class HourlyEmployee extends Employee {
	private double wage; // wage per hour
	private double hours; // hours worked for week

	/**
	 * five-argument constructor
	 * @param first first name of employee
	 * @param last last name of employee
	 * @param ssn SSN of employee
	 * @param hourlyWage hourly wage of employee
	 * @param hoursWorked number of hours worked by employee
	 */
	public HourlyEmployee(String first, String last, String ssn, 
			double hourlyWage, double hoursWorked) {
		super(first, last, ssn);
		setWage(hourlyWage); // validate and store hourly wage
		setHours(hoursWorked); // validate and store hours worked
	} // end five-argument HourlyEmployee constructor

	/**
	 * set wage
	 * @param hourlyWage hourly wage of employee
	 */
	public void setWage(double hourlyWage) {
		if (hourlyWage >= 0.0)
			wage = hourlyWage;
		else
			throw new IllegalArgumentException( 
					"Hourly wage must be >= 0.0" );
	} // end method setWage

	/**
	 * return wage
	 * @return hourly wage of employee
	 */
	public double getWage() {
		return wage;
	} // end method getWage

	/**
	 * set hours worked
	 * @param hoursWorked number of hours worked by employee
	 */
	public void setHours(double hoursWorked)
	{
		if ( ( hoursWorked >= 0.0 ) && ( hoursWorked <= 168.0 ) )
			hours = hoursWorked;
		else
			throw new IllegalArgumentException( 
					"Hours worked must be >= 0.0 and <= 168.0" );
	} // end method setHours

	/**
	 * return hours worked
	 * @return number of hours worked by employee
	 */
	public double getHours() {
		return hours;
	} // end method getHours

	/**
	 * calculate pay; override Payable interface method getPaymentAmount
	 * @return pay of employee
	 */
	@Override
	public double getPaymentAmount() {
		if (getHours() <= 40) // no overtime
			return getWage() * getHours();
		else
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
	} // end method getPaymentAmount

	// return String representation of HourlyEmployee object
	@Override
	public String toString()
	{
		return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f", 
				super.toString(), "hourly wage", getWage(), 
				"hours worked", getHours() );
	} // end method toString
} // end class HourlyEmployee
