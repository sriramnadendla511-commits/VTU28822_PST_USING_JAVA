import java.util.InputMismatchException;
import java.util.Scanner;

public class WEEK9_TASK5_ExceptionHandlingTryCatch {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            try {
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println(a / b);
            } catch (InputMismatchException e) {
                System.out.println("java.util.InputMismatchException");
            } catch (ArithmeticException e) {
                System.out.println("java.lang.ArithmeticException: / by zero");
            }
        }
    }
}
