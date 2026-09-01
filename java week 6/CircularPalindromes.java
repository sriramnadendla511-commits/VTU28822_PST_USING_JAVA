import java.util.Scanner;

public class CircularPalindromes {

    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            String rotated = s.substring(i) + s.substring(0, i);

            if (isPalindrome(rotated)) {
                count++;
                System.out.println("Palindrome rotation: " + rotated);
            }
        }

        System.out.println("Total palindrome rotations: " + count);

        sc.close();
    }
}