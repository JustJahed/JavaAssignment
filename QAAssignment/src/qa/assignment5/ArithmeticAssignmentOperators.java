package qa.assignment5;

public class ArithmeticAssignmentOperators {
	
	    public static int add(int a, int b) {
	        return a + b;
	    }

	    public static int subtract(int a, int b) {
	        return a - b;
	    }
	    
	    public static int divide(int a, int b) {
	            return a / b; 
	    }

	   
	    public static int mod(int a, int b) {
	            return a % b;
	    }
	    
	    public static int multiply(int a, int b) {
	        return a * b;
	    }
	    
	    public static int additionAssignment(int a, int b) {
	        return a += b;
	    }
	    
	    public static int subtractionAssignment(int a, int b) {
	        return a -= b;
	    }

	    public static int divisionAssignment(int a, int b) {
	            return a /= b;
	    }
	    
	    public static int modAssignment(int a, int b) {
	            return a %= b;
	    }
	    
	    public static int multiplicationAssignment(int a, int b) {
	        return a *= b;
	    }

	    public static void main(String[] args) {
	        int x = 25;
	        int y = 3;

	        System.out.println("Addition: " + add(x, y));
	        System.out.println("Subtraction: " + subtract(x, y));
	        System.out.println("Division: " + divide(x, y));
	        System.out.println("Modulus: " + mod(x, y));
	        System.out.println("Multiplication: " + multiply(x, y));

	        System.out.println("Addition assignment: " + additionAssignment(x, y));
	        System.out.println("Subtraction assignment: " + subtractionAssignment(x, y));
	        System.out.println("Division assignment: " + divisionAssignment(x, y));
	        System.out.println("Modulus assignment: " + modAssignment(x, y));
	        System.out.println("Multiplication assignment: " + multiplicationAssignment(x, y));
	    }

}
