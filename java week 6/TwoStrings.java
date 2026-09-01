import java.util.HashSet;
import java.util.Scanner;

public class TwoStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            set.add(s1.charAt(i));
        }

        boolean found = false;

        for (int i = 0; i < s2.length(); i++) {
            if (set.contains(s2.charAt(i))) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}