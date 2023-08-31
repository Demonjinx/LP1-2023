package org.example;
import java.util.Scanner;
import java.util.Scanner;

public class EnglishUserInterface implements UserInterface {
    private MessageBundle messageBundle;

    public EnglishUserInterface(MessageBundle messageBundle) {
        this.messageBundle = messageBundle;
    }

    @Override
    public void displayMenu() {
        System.out.println(messageBundle.getMessage("prompt.selectLanguage"));
        System.out.println("1. English");
        System.out.println("2. Português");
        System.out.println("3. Exit");
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda(messageBundle);
        boolean exit = false;

        while (!exit) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the description:");
                    scanner.nextLine(); // Clear newline
                    String description = scanner.nextLine();
                    System.out.println("Enter the date and time (yyyy-MM-dd HH:mm):");
                    String dateTimeStr = scanner.nextLine();
                    // Parse dateTimeStr to create a Date object
                    // Create an Event object and add it to the agenda
                    break;
                case 2:
                    System.out.println("Enter the description:");
                    scanner.nextLine(); // Clear newline
                    description = scanner.nextLine();
                    System.out.println("Enter the date and time (yyyy-MM-dd HH:mm):");
                    dateTimeStr = scanner.nextLine();
                    // Parse dateTimeStr to create a Date object
                    // Create a Task object and add it to the agenda
                    break;
                case 3:
                    System.out.println("Enter the description:");
                    scanner.nextLine(); // Clear newline
                    description = scanner.nextLine();
                    System.out.println("Enter the date and time (yyyy-MM-dd HH:mm):");
                    dateTimeStr = scanner.nextLine();
                    // Parse dateTimeStr to create a Date object
                    System.out.println("Enter the reminder time (HH:mm):");
                    String reminderTimeStr = scanner.nextLine();
                    // Parse reminderTimeStr to create a Date object
                    // Create a Reminder object and add it to the agenda
                    break;
                case 4:
                    System.out.println("Enter the date (yyyy-MM-dd):");
                    String dateStr = scanner.nextLine();
                    // Parse dateStr to create a Date object
                    // Retrieve and display items for the specified date
                    break;
                case 5:
                    // Display items and prompt user to select an item to edit
                    // Prompt user for new description
                    // Update the item's description
                    break;
                case 6:
                    // Display items and prompt user to select an item to delete
                    // Delete the selected item from the agenda
                    break;
                case 7:
                    exit = true;
                    System.out.println(messageBundle.getMessage("message.exiting"));
                    break;
                default:
                    System.out.println(messageBundle.getMessage("prompt.invalidChoice"));
                    break;
            }
        }
    }
}
