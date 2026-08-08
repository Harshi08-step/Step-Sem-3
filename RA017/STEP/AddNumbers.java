public class AddNumbers {

    // method
    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {

        int number1 = 5;
        int number2 = 10;

        int result = calculateSum(number1, number2);

        System.out.println("Sum = " + result);
    }
}