class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }
    
    // Overloaded method to add two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        System.out.println("Addition of two integers: " + calculator.add(5, 7));
        System.out.println("Addition of two doubles: " + calculator.add(3.5, 2.8));
    }
}
