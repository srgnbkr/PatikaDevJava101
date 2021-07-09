import java.text.DecimalFormat;

public class EmployeeManager implements EmployeeService {

	DecimalFormat decimalFormat = new DecimalFormat("###,###.00");
	

	@Override
	public void tax(Employee employee) {
		if(employee.getSalary()>1000) {
			System.out.println("Ödemeniz Gereken Vergi :"+decimalFormat.format(employee.getSalary() * 0.03 )+" TL");
		}else {
			System.out.println("Vergi Ödemeniz Yoktur");
		}
		
	}

	@Override
	public void bonus(Employee employee) {
		if(employee.getWorkHours()>40) {
			double newSalary = employee.getSalary() + (employee.getWorkHours() - 40) *3;
			System.out.println("Toplam Mesasi Maaşınız : "+decimalFormat.format(newSalary)+" TL");
		}else {
			System.out.println("Maaşınız: "+decimalFormat.format(employee.getSalary())+" Tl");
		}
		
	}

	@Override
	public void raiseSalary(Employee employee) {
		if(2021 - employee.getHireYear()>=19) {
			System.out.println("Maaşınız :"+decimalFormat.format(employee.getSalary() + employee.getSalary()*0.15));
		}else if(2021 - employee.getHireYear()>9 && 2021 - employee.getHireYear()<19) {
			System.out.println("Maaşınız :"+decimalFormat.format(employee.getSalary() + employee.getSalary()*0.10));
		}else {
			System.out.println("Maaşınız :"+decimalFormat.format(employee.getSalary() + employee.getSalary()*0.05));
		}
		
	}

}
