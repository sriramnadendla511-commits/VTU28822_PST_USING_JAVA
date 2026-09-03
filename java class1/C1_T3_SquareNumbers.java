import java.util.Scanner;

public class SquareNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 5 numbers: ");

        for (int i = 1; i <= 5; i++) {
            int n = sc.nextInt();
            int square = n * n;

            System.out.println("Square of " + n + " = " + square);
        }

        sc.close();
    }
}
