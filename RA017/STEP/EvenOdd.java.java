public class EvenOdd {

    // method to check even or odd
    public static void checkEvenOdd(int num) {

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {

        int number = 7;   // you can change this number

        checkEvenOdd(number);
    }
}