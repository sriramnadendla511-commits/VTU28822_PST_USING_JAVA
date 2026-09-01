import java.util.Scanner;

public class stringsimilarity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int length = 0;
            int j = 0;

            while (i + j < s.length()
                    && s.charAt(j) == s.charAt(i + j)) {
                length++;
                j++;
            }

            total += length;
        }

        System.out.println("String Similarity: " + total);

        sc.close();
    }
}