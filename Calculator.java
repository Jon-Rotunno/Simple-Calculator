import java.util.Scanner;

public class Calculator {

    // Method for addition
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method for subtraction
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Call the add and subtract methods
        int additionResult = add(firstNumber, secondNumber);
        int subtractionResult = subtract(firstNumber, secondNumber);

        // Display the results
        System.out.println("Addition result: " + additionResult);
        System.out.println("Subtraction result: " + subtractionResult);
    }
}
