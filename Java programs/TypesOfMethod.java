
class Calculator {
    // Predefined method
    public int add(int a, int b) {
        return a + b;
    }

    // User-defined method
    public int multiply(int a, int b) {
        return a * b;
    }
}

public class TypesOfMethod {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Using predefined method
        int sum = calculator.add(5, 3);
        System.out.println("Sum of 5 and 3: " + sum);

        // Using user-defined method
        int product = calculator.multiply(4, 6);
        System.out.println("Product of 4 and 6: " + product);
    }
}
