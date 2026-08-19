import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class numberofdays {

    public static int daysBetweenDates(String date1, String date2) {
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);

        return (int) Math.abs(ChronoUnit.DAYS.between(d1, d2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dates in YYYY-MM-DD format
        String date1 = sc.nextLine();
        String date2 = sc.nextLine();

        int result = daysBetweenDates(date1, date2);

        System.out.println(result);

        sc.close();
    }
}