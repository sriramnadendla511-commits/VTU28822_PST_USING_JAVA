import java.util.Scanner;

public class PalindromeIndex {

    public static boolean isPalindrome(String s, int left, int right) {

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

        int left = 0;
        int right = s.length() - 1;
        int answer = -1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {

                if (isPalindrome(s, left + 1, right)) {
                    answer = left;
                } else {
                    answer = right;
                }

                break;
            }

            left++;
            right--;
        }

        System.out.println("Index to remove: " + answer);

        sc.close();
    }
}