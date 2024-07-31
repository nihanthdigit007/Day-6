@FunctionalInterface
interface SumFunction {
    int sum(int a, int b);
}

public class Assignment61 {
    public static void main(String[] args) {
        SumFunction add = (a, b) -> a + b;

        int result = add.sum(5, 3);
        System.out.println("The sum is: " + result); // Output: The sum is: 8
    }
}
