package homeWork1;

public class Main {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(" Ahmet " , " Day� " , 66 , 4000 );
		Employee employee2 = new Employee(" Mehmet " , " Toraman " , 38 , 3000);
		Employee employee3 = new Employee(" Engin " , " Demiro� " , 01 , 100000); // :))
		EmployeeManager employeeManager = new EmployeeManager();
		Employee[] employees = {
				employee1 , employee2 , employee3
		};
		for( Employee employee : employees) {
			
			System.out.println("Name : " + employee.name);
			System.out.println("Surname : " + employee.surname);
			System.out.println("Id : " +employee.id);
			employeeManager.chekedid(employee);
			System.out.println("Salary : " + employee.salary);
			employeeManager.showSalary(employee);
			System.out.println("/-------------------------------------------------------------------------");
			
			
		}
		 
		
		
	}

}
