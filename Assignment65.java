import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Assignment65 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Blueberry");

        Predicate<String> lengthGreaterThanFive = s -> s.length() > 5;
        Predicate<String> containsSubstring = s -> s.contains("e");

        List<String> filteredStrings = strings.stream()
                .filter(lengthGreaterThanFive.and(containsSubstring))
                .collect(Collectors.toList());

        System.out.println("Filtered list: " + filteredStrings);
    }
}
