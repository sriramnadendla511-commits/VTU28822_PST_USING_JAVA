import java.util.Arrays;
import java.util.List;

public class pipeline {
       public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 25, 15, 30, 25, 40, 35, 20, 50);

        numbers.stream()
                .distinct()
                .filter(n -> n > 20)
                .map(n -> n * 2)
                .sorted()
                .forEach(System.out::println);
    }
    
}
