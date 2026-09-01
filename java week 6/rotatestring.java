import java.util.Scanner;

public class rotatestring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String goal = sc.nextLine();

        boolean result = s.length() == goal.length()
                && (s + s).contains(goal);

        System.out.println("Can Rotate: " + result);

        sc.close();
    }
}