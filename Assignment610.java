import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Assignment610 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8);

        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);

        max.ifPresentOrElse(
                value -> System.out.println("The maximum value is: " + value),
                () -> System.out.println("The list is empty")
        );

        List<Integer> emptyList = Arrays.asList();

        Optional<Integer> maxEmpty = emptyList.stream()
                .max(Integer::compareTo);

        maxEmpty.ifPresentOrElse(
                value -> System.out.println("The maximum value is: " + value),
                () -> System.out.println("The list is empty")
        );
    }
}
