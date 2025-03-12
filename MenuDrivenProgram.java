import java.util.Scanner;

public class MenuDrivenProgram {

    // Method to display the menu options
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
    }

    // Method to handle the menu choice
    public static void handleMenuChoice(int choice) {
        Scanner scanner = new Scanner(System.in);

        if (choice == 1) {
            greetUser();
        } else if (choice == 2) {
            checkEvenOrOdd();
        } else if (choice == 3) {
            System.out.println("Exiting program. Goodbye!");
            System.exit(0);
        } else {
            System.out.println("Invalid choice. Please enter a number between 1 and 3.");
        }
    }

    // Helper method to display a greeting message
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // Helper method to check if a number is even or odd
    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " is an Even number.");
            } else {
                System.out.println(number + " is an Odd number.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // Clear invalid input
        }
    }

    // Main method to control the program flow
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu(); // Display the menu options
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt(); // Get user input
                handleMenuChoice(choice); // Handle user choice
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                scanner.next(); // Clear invalid input
            }
        }
    }
}
