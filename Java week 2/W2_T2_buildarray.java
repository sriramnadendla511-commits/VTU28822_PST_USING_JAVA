import java.util.Scanner;

public class buildarray {

    // Method to build the permutation array
    public static int[] buildArray(int[] nums) {

        int n = nums.length;

        // Create a new array to store the answer
        int[] ans = new int[n];

        // Build the answer array
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        System.out.print("Output: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i != arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Read array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call the function
        int[] result = buildArray(nums);

        // Print the result
        printArray(result);

        sc.close();
    }
}
