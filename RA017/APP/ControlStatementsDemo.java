public class ControlStatementsDemo {

    public static void main(String[] args) {

        // Variable used in different control statements
        int number = 15;

        // =====================================================
        // 1. if Statement
        // Executes the block only if the condition is true.
        // =====================================================
        if (number > 10) {
            System.out.println("if Statement: Number is greater than 10");
        }

        // =====================================================
        // 2. if-else Statement
        // Executes one block if the condition is true,
        // otherwise executes the else block.
        // =====================================================
        if (number % 2 == 0) {
            System.out.println("if-else: Number is Even");
        } else {
            System.out.println("if-else: Number is Odd");
        }

        // =====================================================
        // 3. else-if Ladder
        // Checks multiple conditions one by one.
        // =====================================================
        if (number >= 90) {
            System.out.println("Grade A");
        } else if (number >= 75) {
            System.out.println("Grade B");
        } else if (number >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }

        // =====================================================
        // 4. switch Statement
        // Selects one case based on the value.
        // =====================================================
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;      // Exits the switch statement

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid Day");
        }

        // =====================================================
        // 5. for Loop
        // Used when the number of iterations is known.
        // =====================================================
        System.out.println("\nFor Loop:");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // =====================================================
        // 6. while Loop
        // Repeats while the condition is true.
        // =====================================================
        System.out.println("\nWhile Loop:");

        int i = 1;

        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        // =====================================================
        // 7. do-while Loop
        // Executes at least once before checking the condition.
        // =====================================================
        System.out.println("\nDo-While Loop:");

        int j = 1;

        do {
            System.out.println("j = " + j);
            j++;
        } while (j <= 5);

        // =====================================================
        // 8. break Statement
        // Immediately exits the loop.
        // =====================================================
        System.out.println("\nBreak Statement:");

        for (int k = 1; k <= 10; k++) {

            if (k == 6) {
                break;      // Stop the loop when k becomes 6
            }

            System.out.println(k);
        }

        // =====================================================
// 9. continue Statement
        // Skips the current iteration and moves to the next.
        // =====================================================
        System.out.println("\nContinue Statement:");

        for (int k = 1; k <= 10; k++) {

            if (k == 6) {
                continue;   // Skip printing 6
            }

            System.out.println(k);
        }
    }
}