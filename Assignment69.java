@FunctionalInterface
interface SquareFunction {
    int square(int x);

    default void printSquare(int x) {
        int result = square(x);
        System.out.println("The square of " + x + " is: " + result);
    }
}

public class Assignment69 {
    public static void main(String[] args) {
        SquareFunction squareFunction = x -> x * x;

        int number = 5;
        squareFunction.printSquare(number);
    }
}
