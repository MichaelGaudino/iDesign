import java.util.Scanner;

public class ExteriorDesignCLI {
    private Scanner scanner;
    private Exterior.ExteriorDesign exteriorDesign;

    public ExteriorDesignCLI() {
        scanner = new Scanner(System.in);
        exteriorDesign = new Exterior.ExteriorDesign();
    }

    public void run() {
        System.out.println("Welcome to iDesign - Your Exterior Design Application");

        boolean running = true;
        while (running) {
            System.out.println("\nPlease select an exterior design option:");
            System.out.println("1. Roofing");
            System.out.println("2. Siding");
            System.out.println("3. Doors");
            System.out.println("4. Windows");
            System.out.println("5. Calculate Square Footage");
            System.out.println("6. Exit");

            int choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    handleRoofing();
                    break;

                case 2:
                    handleSiding();
                    break;

                case 3:
                    handleDoors();
                    break;

                case 4:
                    handleWindows();
                    break;

                case 5:
                    handleCalculateSquareFootage();
                    break;

                case 6:
                    System.out.println("Thank you for using iDesign. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        scanner.close();
    }

    private int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            scanner.nextLine(); // Clear the invalid input
            System.out.print("Invalid input. Please enter a number: ");
        }
        int input = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        return input;
    }

    private void handleRoofing() {
        System.out.println("\nYou selected Roofing.");

        boolean roofingMenu = true;
        while (roofingMenu) {
            System.out.println("\nRoofing Options:");
            System.out.println("1. Shingle");
            System.out.println("2. Tile");
            System.out.println("3. Rubber");
            System.out.println("4. Metal");
            System.out.println("5. Back to Main Menu");

            int roofingChoice = getIntInput("Select a roofing material or go back: ");

            switch (roofingChoice) {
                case 1:
                    // Handle Shingle roofing selection
                    break;

                case 2:
                    // Handle Tile roofing selection
                    break;

                case 3:
                    // Handle Rubber roofing selection
                    break;

                case 4:
                    // Handle Metal roofing selection
                    break;

                case 5:
                    roofingMenu = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private void handleSiding() {
        // Similar logic for handling siding choices
    }

    private void handleDoors() {
        // Similar logic for handling door choices
    }

    private void handleWindows() {
        // Similar logic for handling window choices
    }

    private void handleCalculateSquareFootage() {
        System.out.println("\nYou selected Calculate Square Footage.");
        double squareFootage = getDoubleInput("Enter the square footage: ");
        // Implement logic to use the square footage entered by the user
        System.out.println("You entered " + squareFootage + " square feet.");
    }

    private double getDoubleInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            scanner.nextLine(); // Clear the invalid input
            System.out.print("Invalid input. Please enter a valid number: ");
        }
        double input = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        return input;
    }

    public static void main(String[] args) {
        ExteriorDesignCLI designCLI = new ExteriorDesignCLI();
        designCLI.run();
    }
}