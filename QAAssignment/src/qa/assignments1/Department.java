//Jahed Ullah

package qa.assignments1;

public class Department {
	//instance variables
	public String departmentName;
	private int numOfEmployees;
	private String location;
	
	public void displayDefaultValue() {
		System.out.println("Department name: "+departmentName);
		System.out.println("Number of employees: "+numOfEmployees);
		System.out.println("Location: "+location);
		
	}
	
	public void showDepartmentDetails() {
		departmentName = "Macy's";
		numOfEmployees = 100;
		location = "Queens, NY";
	}
	
	public static void main(String[] args) {
		//instance or object
		Department dept = new Department();
		dept.displayDefaultValue();
		dept.showDepartmentDetails();
		dept.displayDefaultValue();
	}

}
