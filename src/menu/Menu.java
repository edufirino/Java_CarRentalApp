package menu;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    // ╚ ╔ ╟ ─ ╩ ╦ ═ ╬ ╧ ╗ ╝
    public void displayMenu() {
        jumpLines(20);
        for (Operations op : Operations.values()) {
            System.out.println(op.VAL() + ") " + op.DES());
        }

        System.out.print("Selection: ");
        pick();
    }

    public String getInput(String question) {

        System.out.print(question + ": ");
        while (!scanner.hasNext()) {
            scanner.next();
        }

        String output = scanner.next();
        return output;
    }

    public void pick() {

        int choice = scanner.nextInt();

        if (choice == Operations.LIST_ALL_STAFF.INT()) {
            listAllStaff();
        } else if (choice == Operations.LIST_STAFF_BY_CATEGORY.INT()) {
            listStaffByCategory();
        } else if (choice == Operations.LIST_STAFF_BY_TASK.INT()) {
            listStaffByTask();
        } else if (choice == Operations.SEARCH_STAFF_BY_NAME.INT()) {
            searchStaffByName();
        } else if (choice == Operations.LIST_ALL_CUSTOMERS.INT()) {
            listAllCustomers();
        } else if (choice == Operations.SEARCH_CUSTOMER_BY_NAME.INT()) {
            searchCustomerByName();
        } else if (choice == Operations.LIST_ALL_CARS.INT()) {
            listAllCars();
        } else if (choice == Operations.LIST_CARS_BY_TYPE.INT()) {
            listCarsByType();
        } else if (choice == Operations.SEARCH_CAR_BY_REG.INT()) {
            searchCarByReg();
        } else if (choice == Operations.FIND_CAR_BY_CUSTOMER.INT()) {
            findCarByCustomer();
        } else if (choice == Operations.EXIT.INT()) {
            exit();
        } else {
            System.err.println("Unrecognized option");
        }

        lineBreak();
        // displayMenu();
    }

    public void lineBreak() {
        System.out.println();
        System.out.println(
                "====================================================================================================================================================");
        System.out.println();
    }

    private void listAllStaff() {

    }

    private void listStaffByCategory() {
        String option = getInput("Choose a Category from the list:");

    }

    private void listStaffByTask() {
        String option = getInput("Choose a Task from the list:");
    }

    private void searchStaffByName() {
        String option = getInput("Choose a Task from the list:");
    }

    private void listAllCustomers() {
    }

    private void searchCustomerByName() {
    }

    private void listAllCars() {
    }

    private void listCarsByType() {
    }

    private void searchCarByReg() {
    }

    private void findCarByCustomer() {
    }

    public void exit() {
        System.out.println("You've exited the program");
        System.exit(0);
    }

    public void jumpLines(int numberLines) {
        for (int i = 0; i < numberLines; i++) {
            System.out.println();
        }
    }

    public void displayBanner() {
        final String[] banner = { "  _____             _____            _        _                        ",
                " / ____|           |  __ \\          | |      | |     /\\                ",
                "| |     __ _ _ __  | |__) |___ _ __ | |_ __ _| |    /  \\   _ __  _ __  ",
                "| |    / _` | '__| |  _  // _ \\ '_ \\| __/ _` | |   / /\\ \\ | '_ \\| '_ \\ ",
                "| |___| (_| | |    | | \\ \\  __/ | | | || (_| | |  / ____ \\| |_) | |_) |",
                " \\_____\\__,_|_|    |_|  \\_\\___|_| |_|\\__\\__,_|_| /_/    \\_\\ .__/| .__/ ",
                "                                                          | |   | |    ",
                "                                                          |_|   |_|   " };

        for (String item : banner) {
            System.out.println(item);
        }
    }
}