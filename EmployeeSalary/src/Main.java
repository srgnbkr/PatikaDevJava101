
public class Main {

	public static void main(String[] args) {
		EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.tax(new Employee("Sergen",2890,455,1995));
		employeeManager.bonus(new Employee("Sergen",2890,40,1995));
		employeeManager.raiseSalary(new Employee("Sergen",3000,40,1985));

	}

}
