import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment62 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Blueberry");

        List<String> filteredStrings = strings.stream()
                .filter(s -> !s.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Filtered list: " + filteredStrings);
    }
}
