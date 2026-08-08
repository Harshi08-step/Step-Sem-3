public class MethodDemo {

    // ==========================================================
    // Instance (Non-static) Method
    // This method belongs to an object.
    // To call it, we must first create an object of the class.
    // ==========================================================
    void displayMessage() {
        System.out.println("Hello! This is an Instance Method.");
    }

    // ==========================================================
    // Instance Method with Parameters
    // Accepts values and prints their sum.
    // ==========================================================
    void addNumbers(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    // ==========================================================
    // Instance Method with Return Value
    // Returns the multiplication of two numbers.
    // ==========================================================
    int multiply(int a, int b) {
        return a * b;
    }

    // ==========================================================
    // Static Method
    // This method belongs to the class.
    // It can be called without creating an object.
    // ==========================================================
    static void welcome() {
        System.out.println("Welcome to Java!");
    }

    // ==========================================================
    // Static Method with Return Value
    // Returns the square of a number.
    // ==========================================================
    static int square(int num) {
        return num * num;
    }

    // ==========================================================
    // Main Method (Program Execution Starts Here)
    // ==========================================================
    public static void main(String[] args) {

        // ======================================================
        // Calling Static Methods
        // No object is required because static methods belong
        // to the class itself.
        // ======================================================
        welcome();

        int sq = square(5);
        System.out.println("Square = " + sq);

        // ======================================================
        // Creating an Object
        // Syntax:
        // ClassName objectName = new ClassName();
        // ======================================================
        MethodDemo obj = new MethodDemo();

        // ======================================================
        // Calling Instance Methods
        // These methods require an object.
        // ======================================================
        obj.displayMessage();

        obj.addNumbers(10, 20);

        int result = obj.multiply(5, 6);
        System.out.println("Multiplication = " + result);
    }
}