
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Lambda expressions to implement MathOperation interface for different operations
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;

        // Performing operations
        System.out.println("Addition result: " + add.operate(5, 3));         // Output: Addition result: 8
        System.out.println("Subtraction result: " + subtract.operate(5, 3)); // Output: Subtraction result: 2
        System.out.println("Multiplication result: " + multiply.operate(5, 3)); // Output: Multiplication result: 15
    }
}
