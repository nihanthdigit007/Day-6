import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment66 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());

        strings.forEach(printUpperCase);
    }
}
