
import java.util.Scanner;

public class BankTransactionReferenceValidator {

    static String normalizeReference(String raw) {
        if (raw == null) {
            return null;
        }

        raw = raw.trim();

        if (raw.length() < 3) {
            return raw;
        }

        return raw.substring(0, 3).toUpperCase()
                + raw.substring(3);
    }

    static String validateAndFormat(String reference) {

        if (reference == null || reference.length() != 14) {
            return "Invalid: reference must be exactly 14 characters";
        }

        // Validate the first 3 characters
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(reference.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }

        // Validate the remaining 11 characters
        for (int i = 3; i < 14; i++) {
            if (!Character.isDigit(reference.charAt(i))) {
                return "Invalid: body must contain only digits";
            }
        }

        String bankCode = reference.substring(0, 3);
        String date = reference.substring(3, 9);
        String sequence = reference.substring(9, 14);

        StringBuilder formatted = new StringBuilder();

        formatted.append("[")
                 .append(bankCode)
                 .append("] DATE: ")
                 .append(date.substring(0, 2))
                 .append("/")
                 .append(date.substring(2, 4))
                 .append("/")
                 .append(date.substring(4, 6))
                 .append(" | SEQ: ")
                 .append(sequence);

        return formatted.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter transaction reference: ");
        String raw = sc.nextLine();

        String normalized = normalizeReference(raw);
        String result = validateAndFormat(normalized);

        System.out.println(result);

        sc.close();
    }
}
