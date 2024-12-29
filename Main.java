import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an operation: +, -, *, / or type 'exit' to quit:");
            String operation = scanner.next();

            if (operation.equals("exit")) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.println("Enter first number:");
            double num1 = getValidNumber(scanner);

            System.out.println("Enter second number:");
            double num2 = getValidNumber(scanner);

            double result = 0;
            boolean validOperation = true;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operation.");
                    validOperation = false;
                    break;
            }

            if (validOperation) {
                System.out.println("Result: " + result);
            }
        }
        scanner.close();
    }

    private static double getValidNumber(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number:");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
