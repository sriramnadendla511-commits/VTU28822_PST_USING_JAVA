import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAllAnagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter pattern: ");
        String p = sc.nextLine();

        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            System.out.println(result);
            sc.close();
            return;
        }

        int[] countP = new int[26];
        int[] countS = new int[26];

        for (int i = 0; i < p.length(); i++) {
            countP[p.charAt(i) - 'a']++;
            countS[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= s.length() - p.length(); i++) {

            if (java.util.Arrays.equals(countP, countS)) {
                result.add(i);
            }

            if (i + p.length() < s.length()) {
                countS[s.charAt(i) - 'a']--;
                countS[s.charAt(i + p.length()) - 'a']++;
            }
        }

        System.out.println("Anagram indices: " + result);

        sc.close();
    }
}