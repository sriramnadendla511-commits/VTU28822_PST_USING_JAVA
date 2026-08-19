import java.util.Arrays;

public class SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        Integer[] idx = new Integer[names.length];
        for (int i = 0; i < names.length; i++) idx[i] = i;
        Arrays.sort(idx, (a, b) -> heights[b] - heights[a]);
        String[] ans = new String[names.length];
        for (int i = 0; i < names.length; i++) ans[i] = names[idx[i]];
        return ans;
    }

    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        System.out.println(Arrays.toString(sortPeople(names, heights)));

        String[] names2 = {"Alice", "Bob", "Bob"};
        int[] heights2 = {155, 185, 150};
        System.out.println(Arrays.toString(sortPeople(names2, heights2)));
    }
}