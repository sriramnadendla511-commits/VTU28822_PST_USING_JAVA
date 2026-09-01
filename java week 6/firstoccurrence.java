import java.util.Scanner;

public class firstoccurrence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter haystack string: ");
        String haystack = sc.nextLine();

        System.out.print("Enter needle string: ");
        String needle = sc.nextLine();

        int index = haystack.indexOf(needle);

        System.out.println("First occurrence index: " + index);

        sc.close();
    }
}