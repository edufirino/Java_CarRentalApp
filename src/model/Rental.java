package model;

import model.car.Car;
import model.staff.Staff;

public class Rental {

    private Staff staff;
    private Customer customer;
    private Car car;

    public Rental(Staff staff, Customer customer, Car car) {
        this.staff = staff;
        this.customer = customer;
        this.car = car;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}
