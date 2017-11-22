/**
 * Fig. 10.13: Employee.java <br>
 * Employee abstract superclass implements Payable.
 * @author Deitel & Associates, Inc.
 */
// kenapa harus abstrak
public abstract class Employee implements Payable {
// public class Employee implements Payable {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	/**
	 * three-argument constructor
	 * @param first first name of employee
	 * @param last last name of employee
	 * @param ssn SSN of employee
	 */
	public Employee(String first, String last, String ssn) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	} // end three-argument Employee constructor

	/**
	 * set first name
	 * @param first first name of employee
	 */
	public void setFirstName(String first) {
		firstName = first; // should validate
	} // end method setFirstName

	/**
	 * return first name
	 * @return first name of employee
	 */
	public String getFirstName() {
		return firstName;
	} // end method getFirstName

	/**
	 * set last name
	 * @param last last name of employee
	 */
	public void setLastName(String last) {
		lastName = last; // should validate
	} // end method setLastName

	/**
	 * return last name
	 * @return last name of employee
	 */
	public String getLastName() {
		return lastName;
	} // end method getLastName

	/**
	 * set social security number
	 * @param ssn SSN of employee
	 */
	public void setSocialSecurityNumber(String ssn) {
		socialSecurityNumber = ssn; // should validate
	} // end method setSocialSecurityNumber

	/**
	 * return social security number
	 * @return SSN of employee
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	} // end method getSocialSecurityNumber

	/**
	 * return String representation of Employee object
	 * @return String representation of Employee object
	 */
	@Override
	public String toString() {
		return String.format( "%s %s\nsocial security number: %s", 
				getFirstName(), getLastName(), getSocialSecurityNumber());
	} // end method toString

//	@Override
//	public double getPaymentAmount() {
//		return 0;
//	} 
	// Note: We do not implement Payable method getPaymentAmount here so  
	// this class must be declared abstract to avoid a compilation error.
} // end abstract class Employee
