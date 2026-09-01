import java.util.Scanner;

public class marsexploration {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter received message: ");
        String s = sc.nextLine();

        String expected = "SOS";
        int changes = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != expected.charAt(i % 3)) {
                changes++;
            }
        }

        System.out.println("Changed characters: " + changes);

        sc.close();
    }
}