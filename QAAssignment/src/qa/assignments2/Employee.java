package qa.assignments2;



public class Employee {
	private static int employeeCount;
	private static String companyName;
	private int id;
	private String name;
	private double salary;
	



public void printEmployeeDetails() {
	String localDepartment = "HR";
    double localTaxRate = 0.60;
    System.out.println("Employee ID: " + id);
    System.out.println("Employee Name: " + name);
    System.out.println("Employee Salary: " + salary);
    System.out.println("Company Name: " + companyName);
    System.out.println("Employee Count: " + employeeCount);
    System.out.println("Local Department: " + localDepartment);
    System.out.println("Local Tax Rate: " + localTaxRate);
}

public static void main(String[] args) {
	employeeCount = 300;
	companyName = "Apple";
	Employee emp = new Employee();
	emp.printEmployeeDetails();
	   
	}
}