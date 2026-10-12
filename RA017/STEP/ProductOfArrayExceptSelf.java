
import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArrayExceptSelf {

    static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        // Forward pass: product of elements to the left
        int prefix = 1;

        for (int i = 0; i < n; i++) {
            answer[i] = prefix;
            prefix *= nums[i];
        }

        // Backward pass: multiply by product of elements to the right
        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = productExceptSelf(nums);

        System.out.println(Arrays.toString(result));

        sc.close();
    }
}
