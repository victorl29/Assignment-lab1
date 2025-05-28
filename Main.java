package lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BasicCalculator calculator = new BasicCalculator();
        boolean keepRunning = true;

        System.out.println("Welcome to the Basic Calculator!");

        while (keepRunning) {
            try {
                System.out.println("\nChoose an operation:");
                System.out.println("1: Addition");
                System.out.println("2: Subtraction");
                System.out.println("3: Multiplication");
                System.out.println("4: Division");
                System.out.println("5: Exit");
                System.out.print("Select (1-5): ");

                int choice = Integer.parseInt(scanner.nextLine());

                if (choice == 5) {
                    System.out.println("Thank you for using the Basic Calculator!");
                    break;
                }

                if (choice < 1 || choice > 5) {
                    System.out.println("Invalid operation. Please choose between 1 and 5.");
                    continue;
                }

                System.out.print("Enter the first number: ");
                double num1 = Double.parseDouble(scanner.nextLine());

                System.out.print("Enter the second number: ");
                double num2 = Double.parseDouble(scanner.nextLine());

                double result = 0;

                switch (choice) {
                    case 1:
                        result = calculator.add(num1, num2);
                        break;
                    case 2:
                        result = calculator.subtract(num1, num2);
                        break;
                    case 3:
                        result = calculator.multiply(num1, num2);
                        break;
                    case 4:
                        result = calculator.divide(num1, num2);
                        break;
                }

                System.out.println("Result: " + result);

                System.out.print("Do another calculation? (yes/no): ");
                String again = scanner.nextLine().trim().toLowerCase();
                keepRunning = again.equals("yes");

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numeric values only.");
            }
        }

        scanner.close();
    }
}
