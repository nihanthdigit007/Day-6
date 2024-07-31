import java.util.function.BiFunction;

public class Assignment68 {
    public static void main(String[] args) {
        BiFunction<String, String, String> concatenateWithSpace = (str1, str2) -> str1 + " " + str2;

        String firstString = "Hello";
        String secondString = "World";
        String result = concatenateWithSpace.apply(firstString, secondString);

        System.out.println("Concatenated string: " + result);
    }
}
