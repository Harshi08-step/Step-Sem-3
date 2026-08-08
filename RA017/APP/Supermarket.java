import java.util.Scanner;

class Supermarket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] price = new int[5];
        int total = 0;

        // Read prices
        for (int i = 0; i < 5; i++) {
            price[i] = sc.nextInt();
        }

        // Calculate total
        for (int i = 0; i < 5; i++) {
            total = total + price[i];
        }

        System.out.println("Total Bill : " + total);

        // Check discount
        if (total > 5000) {
            System.out.println("Discount Applicable");
        } else {
            System.out.println("No Discount");
        }
    }
}

