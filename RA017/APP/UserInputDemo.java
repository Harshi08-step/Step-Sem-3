import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.Console;

public class UserInputDemo {

    public static void main(String[] args) throws IOException {

        // =====================================================
        // 1. Scanner Class
        // Most commonly used for beginners.
        // Can read int, double, float, String, char, etc.
        // =====================================================

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Scanner Example =====");

        System.out.print("Enter an Integer: ");
        int age = sc.nextInt();

        System.out.print("Enter a Decimal Number: ");
        double salary = sc.nextDouble();

        sc.nextLine(); // Clears the newline left by nextDouble()

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Gender (M/F): ");
        char gender = sc.next().charAt(0);

        System.out.println("\nScanner Output");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Gender : " + gender);

        // =====================================================
        // 2. BufferedReader
        // Reads input as String.
        // Numbers must be converted using parse methods.
        // Faster than Scanner.
        // =====================================================

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\n===== BufferedReader Example =====");

        System.out.print("Enter Your City: ");
        String city = br.readLine();

        System.out.print("Enter Your Marks: ");
        int marks = Integer.parseInt(br.readLine());

        System.out.println("City  : " + city);
        System.out.println("Marks : " + marks);

        // =====================================================
        // 3. Console Class
        // Works only in a command prompt/terminal.
        // Usually returns null in Eclipse/IntelliJ/VS Code.
        // =====================================================

        Console con = System.console();

        if (con != null) {
            System.out.println("\n===== Console Example =====");

            String college = con.readLine("Enter College Name: ");

            System.out.println("College: " + college);
        } else {
            System.out.println("\nConsole is not available in this IDE.");
        }

        sc.close();
    }
}