package Week_Tasks.Week8_Tasks;

import java.util.*;

public class Week8_Task10_JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            try {
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println(x / y);
            } catch (ArithmeticException e) {
                System.out.println("Exception caught: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Exception caught: " + e);
                sc.next();
            }
        }
    }
}

/*
OUTPUT:
Input:
10 2
10 0
10 a

Output:
5
Exception caught: / by zero
Exception caught: java.util.InputMismatchException
*/
