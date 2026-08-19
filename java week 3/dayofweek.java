import java.time.LocalDate;
import java.util.Scanner;

public class dayofweek {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, day);

        String dayOfWeek = date.getDayOfWeek().toString();

        System.out.println("Day of week: " + dayOfWeek);

        sc.close();
    }
}