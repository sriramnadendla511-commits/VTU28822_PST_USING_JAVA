import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateAndTime {

    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        String result = findDay(month, day, year);

        System.out.println(result);

        sc.close();
    }
}