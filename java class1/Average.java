import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int n = 5;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum = sum + num;
        }

        double average = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        sc.close();
    }
}