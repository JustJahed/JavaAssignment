package qa.assignment4;

public class Student {
	private String name;
    private int age;
    private String address;
    private static int studentCount = 0;

  
    public void setStudentInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    protected String getStudentInfo() {
        return "Name: " + this.name + ", Age: " + this.age;
    }

    
    String getAddress() {
        return address;
    }

   
    private void setAddress(String address) {
        this.address = address;
    }

   
    public static void setStudentCount(int count) {
        studentCount = count;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static void main(String[] args) {
        Student student = new Student();
        
     
        student.setStudentInfo("Jahed", 25);
        student.setAddress("123 Main St, Queens");

      
        System.out.println(student.getStudentInfo());

       
        System.out.println("Address: " + student.getAddress());

      
        Student.setStudentCount(3);
        System.out.println("Student Count: " + Student.getStudentCount());
    }
	

}
