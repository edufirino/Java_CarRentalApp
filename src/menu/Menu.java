package menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import Util.Util;
import model.Customer;
import model.Rental;
import model.car.Car;
import model.staff.Staff;
import model.staff.Tasks;

public class Menu {

    ArrayList<Staff> listStaff = new ArrayList<>();
    ArrayList<Customer> listCustomers = new ArrayList<>();
    ArrayList<Rental> listRentals = new ArrayList<>();
    ArrayList<Car> listCars = new ArrayList<>();
    ArrayList<Car> listRentedCars = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public Menu() {
        generateFakeData();
        displayMenu();

        // searchStaffByName();
    }

    public static void main(String[] args) {
        new Menu();
    }

    private void generateFakeData() {

        for (int i = 0; i < 10; i++) {
            listStaff.add(Util.randomStaff());
        }

        for (int i = 0; i < 30; i++) {
            listCustomers.add(Util.randomCustomer());
        }

        for (int i = 0; i < 300; i++) {
            listCars.add(Util.randomCar());
        }

        Staff staff = null;
        Car car = null;

        for (Customer customer : listCustomers) {
            staff = listStaff.get(Util.randomNumber(listStaff.size()));

            do {
                car = listCars.get(Util.randomNumber(listCars.size()));
            } while (listRentedCars.contains(car));
            listRentedCars.add(car);

            listRentals.add(new Rental(staff, customer, car));
        }

    }

    public void displayMenu() {
        jumpLines(5);
        lineBreak();
        displayBanner();
        for (Operations op : Operations.values()) {
            System.out.println(op.VAL() + ") " + op.DES());
        }
        lineBreak();

        System.out.print("Selection: ");
        pick();
        delay2seconds();

        displayMenu();
    }

    public String getInput(String question) {
        scanner = new Scanner(System.in);
        System.out.print(question);

        String output = "";
        while (!scanner.hasNextLine()) {
            output = scanner.nextLine();
        }
        output = scanner.nextLine();

        return output;
    }

    public void pick() {
        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == Operations.LIST_ALL_STAFF.INT()) {
            listAllStaff();// DONE
        } else if (choice == Operations.LIST_STAFF_BY_CATEGORY.INT()) {
            listStaffByCategory();// DONE
        } else if (choice == Operations.LIST_STAFF_BY_TASK.INT()) {
            listStaffByTask();// DONE
        } else if (choice == Operations.SEARCH_STAFF_BY_NAME.INT()) {
            searchStaffByName();// DONE
        } else if (choice == Operations.LIST_ALL_CUSTOMERS.INT()) {
            listAllCustomers();// DONE
        } else if (choice == Operations.SEARCH_CUSTOMER_BY_NAME.INT()) {
            searchCustomerByName();// DONE
        } else if (choice == Operations.LIST_ALL_CARS.INT()) {
            listAllCars();// DONE
        } else if (choice == Operations.LIST_CARS_BY_TYPE.INT()) {
            listCarsByType();// DONE
        } else if (choice == Operations.SEARCH_CAR_BY_REG.INT()) {
            searchCarByReg();// DONE
        } else if (choice == Operations.FIND_CAR_BY_CUSTOMER.INT()) {
            findCarByCustomer();// DONE
        } else if (choice == Operations.EXIT.INT()) {
            exit();// DONE
        } else {
            System.err.println("Unrecognized option");
        }

        lineBreak();
        // displayMenu();
    }

    public void lineBreak() {
        System.out.println(
                "----------------------------------------------------------------------------------------------------");
    }

    private void printRow(ArrayList<String> format, ArrayList<String> cells) {
        System.out.printf("|");
        for (int i = 0; i < cells.size(); i++) {
            System.out.printf(format.get(i), cells.get(i));
        }
        System.out.println();
    }

    private void listAllStaff() {
        printStaff(listStaff);
    }

    private void printStaff(ArrayList<Staff> list) {
        ArrayList<String> staffFormat = new ArrayList<>();
        staffFormat.add(" %-12s |");
        staffFormat.add(" %-23s |");
        staffFormat.add(" %-12s |");
        staffFormat.add(" %-23s |");
        staffFormat.add(" %-15s |");

        ArrayList<String> columns = new ArrayList<>();
        columns.add("Staff Number");
        columns.add("Name");
        columns.add("Salary Level");
        columns.add("Task");
        columns.add("Type");

        lineBreak();
        printRow(staffFormat, columns);
        lineBreak();

        ArrayList<String> cells = new ArrayList<>();
        for (Staff staff : list) {
            cells.add(staff.getId());
            cells.add(staff.getName());
            cells.add(staff.getSalaryLevel());
            cells.add(staff.getTask());
            cells.add(staff.getType());
            printRow(staffFormat, cells);
            cells.clear();
        }
    }

    private void listStaffByCategory() {

        ArrayList<String> categoryFormat = new ArrayList<>();
        categoryFormat.add(" %-3s |");
        categoryFormat.add(" %-15s |");

        ArrayList<String> columns = new ArrayList<>();
        columns.add("Id");
        columns.add("Role");

        lineBreak();
        printRow(categoryFormat, columns);
        lineBreak();

        ArrayList<String> cells = new ArrayList<>();

        for (int i = 0; i < Staff.types.length; i++) {
            cells.add(i + "");
            cells.add(Staff.types[i]);
            printRow(categoryFormat, cells);
            cells.clear();
        }

        lineBreak();

        String option = getInput("Choose a Category from the list by its Id:");

        option = Staff.types[Integer.parseInt(option)];

        ArrayList<Staff> listStaffCategory = new ArrayList<>();

        for (Staff staff : listStaff) {
            if (staff.getType().equals(option)) {
                listStaffCategory.add(staff);
            }
        }
        System.out.println("There are " + listStaffCategory.size() + " staff with this role.");
        printStaff(listStaffCategory);

    }

    private void listStaffByTask() {
        ArrayList<String> taskFormat = new ArrayList<>();
        taskFormat.add(" %-3s |");
        taskFormat.add(" %-15s |");

        ArrayList<String> columns = new ArrayList<>();
        columns.add("Id");
        columns.add("Task");

        lineBreak();
        printRow(taskFormat, columns);
        lineBreak();

        ArrayList<String> cells = new ArrayList<>();

        for (int i = 0; i < Tasks.values().length; i++) {
            cells.add(i + "");
            cells.add(Tasks.values()[i].DES());
            printRow(taskFormat, cells);
            cells.clear();
        }

        lineBreak();

        String option = getInput("Choose a Task from the list by its Id:");

        // option = Staff.types[Integer.parseInt(option)];
        option = Tasks.values()[Integer.parseInt(option)].DES();

        ArrayList<Staff> listStaffTask = new ArrayList<>();

        for (Staff staff : listStaff) {
            if (staff.getTask().equals(option)) {
                listStaffTask.add(staff);
            }
        }
        System.out.println("There are " + listStaffTask.size() + " staff performing this task.");
        printStaff(listStaffTask);

    }

    private void searchStaffByName() {
        String option = getInput("Type the staff name: ");
        ArrayList<Staff> listStaffByName = new ArrayList<>();
        for (Staff staff : listStaff) {
            if (staff.getName().equalsIgnoreCase(option)) {
                listStaffByName.add(staff);
            }
        }
        System.out.println("There are " + listStaffByName.size() + " staff with this name.");
        printStaff(listStaffByName);
    }

    private void printCustomer(ArrayList<Customer> list) {
        ArrayList<String> customerFormat = new ArrayList<>();
        customerFormat.add(" %-3s |");
        customerFormat.add(" %-22s |");
        customerFormat.add(" %-13s |");
        customerFormat.add(" %-20s |");

        ArrayList<String> columns = new ArrayList<>();
        columns.add("Id");
        columns.add("Name");
        columns.add("Date Of Birth");
        columns.add("Credit Card Number");

        lineBreak();
        printRow(customerFormat, columns);
        lineBreak();

        ArrayList<String> cells = new ArrayList<>();
        for (Customer customer : list) {
            cells.add(customer.getId());
            cells.add(customer.getName());
            cells.add(customer.getDateOfBirth());
            cells.add(customer.getCreditCardNumber());
            printRow(customerFormat, cells);
            cells.clear();
        }
    }

    private void listAllCustomers() {
        printCustomer(listCustomers);
    }

    private void searchCustomerByName() {
        String option = getInput("Type the Customer name: ");
        ArrayList<Customer> listCustomerByName = new ArrayList<>();
        for (Customer customer : listCustomers) {
            if (customer.getName().equalsIgnoreCase(option)) {
                listCustomerByName.add(customer);
            }
        }
        System.out.println("There are " + listCustomerByName.size() + " customer with this name.");
        printCustomer(listCustomerByName);
    }

    private void printCar(ArrayList<Car> list) {
        ArrayList<String> carFormat = new ArrayList<>();
        carFormat.add(" %-19s |");
        carFormat.add(" %-6s |");
        carFormat.add(" %-12s |");
        carFormat.add(" %-22s |");
        carFormat.add(" %-5s |");

        ArrayList<String> columns = new ArrayList<>();
        columns.add("Registration Number");
        columns.add("Type");
        columns.add("Make");
        columns.add("Model");
        columns.add("Seats");

        lineBreak();
        printRow(carFormat, columns);
        lineBreak();

        ArrayList<String> cells = new ArrayList<>();
        for (Car car : list) {
            cells.add(car.getRegNumber());
            cells.add(car.getType());
            cells.add(car.getMake());
            cells.add(car.getModel());
            cells.add(car.getNumberSeats());
            printRow(carFormat, cells);
            cells.clear();
        }
    }

    private void listAllCars() {
        printCar(listCars);
    }

    private void listCarsByType() {
        ArrayList<String> carTypeFormat = new ArrayList<>();
        carTypeFormat.add(" %-3s |");
        carTypeFormat.add(" %-8s |");

        ArrayList<String> columns = new ArrayList<>();
        columns.add("Id");
        columns.add("Type");

        lineBreak();
        printRow(carTypeFormat, columns);
        lineBreak();

        ArrayList<String> cells = new ArrayList<>();

        for (int i = 0; i < Car.types.length; i++) {
            cells.add(i + "");
            cells.add(Car.types[i]);
            printRow(carTypeFormat, cells);
            cells.clear();
        }

        lineBreak();

        String option = getInput("Choose a type from the list by its Id:");

        option = Car.types[Integer.parseInt(option)];

        ArrayList<Car> listCarsByType = new ArrayList<>();

        for (Car car : listCars) {
            if (car.getType().equals(option)) {
                listCarsByType.add(car);
            }
        }
        System.out.println("There are " + listCarsByType.size() + " cars with this type.");
        printCar(listCarsByType);
        listCarsByType.get(0).displaySpeciality();
    }

    private void searchCarByReg() {
        String option = getInput("Type the car registration number: ");
        ArrayList<Car> listCarsByRegNumber = new ArrayList<>();
        for (Car car : listCars) {
            if (car.getRegNumber().equals(option))
                listCarsByRegNumber.add(car);
        }
        printCar(listCarsByRegNumber);

    }

    private void delay2seconds() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void findCarByCustomer() {
        listAllCustomers();
        String option = getInput("Choose a customer from the list by its Id:");

        ArrayList<Car> listCarByCustomer = new ArrayList<>();
        Customer chosenCustomer = listCustomers.get(Integer.parseInt(option) - 1);
        for (Rental rental : listRentals) {
            if (rental.getCustomer().equals(chosenCustomer)) {
                listCarByCustomer.add(rental.getCar());
                break;
            }
        }
        printCar(listCarByCustomer);
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