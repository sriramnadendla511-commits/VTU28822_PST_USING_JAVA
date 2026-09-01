import java.util.Scanner;

public class RepeatedSubstringPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        boolean result = false;

        for (int i = 1; i <= s.length() / 2; i++) {

            if (s.length() % i == 0) {

                String part = s.substring(0, i);
                StringBuilder repeated = new StringBuilder();

                for (int j = 0; j < s.length() / i; j++) {
                    repeated.append(part);
                }

                if (repeated.toString().equals(s)) {
                    result = true;
                    break;
                }
            }
        }

        System.out.println("Repeated Substring Pattern: " + result);

        sc.close();
    }
}