package qa.assignment6;

public class Operators {
	 // Relational operations
	
    public static boolean isEqual(int a, int b) {
        return a == b;
    }

    public static boolean isNotEqual(int a, int b) {
        return a != b;
    }

    public static boolean isGreater(int a, int b) {
        return a > b;
    }

    public static boolean isLess(int a, int b) {
        return a < b;
    }

    public static boolean isGreaterOrEqual(int a, int b) {
        return a >= b;
    }

    public static boolean isLessOrEqual(int a, int b) {
        return a <= b;
    }

    // Logical operations
    
    public static boolean logicalAnd(boolean a, boolean b) {
        return a && b;
    }

    public static boolean logicalOr(boolean a, boolean b) {
        return a || b;
    }

    public static boolean logicalNot(boolean a) {
        return !a;
    }

    // Unary operations
    
    public static int increment(int a) {
        return a++;
    }

    public static int decrement(int a) {
        return a--;
    }

    public static void main(String[] args) {
        int x = 25;
        int y = 3;
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("Relational Operations:");
        System.out.println("Is Equal? " + isEqual(x, y));
        System.out.println("Is Not Equal? " + isNotEqual(x, y));
        System.out.println("Is Greater? " + isGreater(x, y));
        System.out.println("Is Less? " + isLess(x, y));
        System.out.println("Is Greater or Equal? " + isGreaterOrEqual(x, y));
        System.out.println("Is Less or Equal? " + isLessOrEqual(x, y));

        System.out.println("\nLogical Operations:");
        System.out.println("Logical AND: " + logicalAnd(bool1, bool2));
        System.out.println("Logical OR: " + logicalOr(bool1, bool2));
        System.out.println("Logical NOT for bool1: " + logicalNot(bool1));

        System.out.println("\nUnary Operations:");
        System.out.println("Increment x: " + increment(x));
        System.out.println("Decrement y: " + decrement(y));
    }

}
