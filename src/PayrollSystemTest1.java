import java.util.ArrayList;

public class PayrollSystemTest1 {

	public static void main(String[] args) {
		// create subclass objects
		SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);

		System.out.println("Employees processed individually: \n");
		// SalariedEmployee print override lang toString
		System.out.printf("%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.getPaymentAmount());

		// arraylist
		ArrayList<Employee> employees;
		employees = new ArrayList<>();

		// anonimous $1
		employees.add(new Employee("sani", "udin","11111") {
			
			@Override
			public double getPaymentAmount() {
				// TODO Auto-generated method stub
				return 300;
			}
		});
		
		employees.add(new CommissionEmployee("budi", "han", "11112", 5000, 0.5));
		employees.add(new SalariedEmployee("rani", "hani", "11113", 4500));
		employees.add(new HourlyEmployee("imam", "dani", "11114", 5000, 0.5));
		employees.add(new BasePlusCommissionEmployee("imam", "dani", "11115", 5000, 0.5, 10));
		employees.add(new SalariedEmployee("fani", "lani", "11116", 4500));

		System.out.println("Employees processed polymorphically:\n");

		// generically process each element in array employees
		for (Employee currentEmployee : employees) {
			System.out.println(currentEmployee); // invokes toString

			// determine whether element is a BasePlusCommissionEmployee
			if (currentEmployee instanceof BasePlusCommissionEmployee) {
				// downcast Employee reference to
				// BasePlusCommissionEmployee reference
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

				employee.setBaseSalary(1.10 * employee.getBaseSalary());

				System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
			} // end if

			System.out.printf("earned $%,.2f%n%n", currentEmployee.getPaymentAmount());
		} // end for

		// get type name of each object in employees array
		int d = 0;
		for (Employee currentEmployee : employees) {
			d++;
			System.out.printf("Employee %d is a %s%n", d, currentEmployee.getClass().getName());
		}
		
	}

}
