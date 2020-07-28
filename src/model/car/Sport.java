package model.car;

public class Sport extends Car {

    public Sport(String regNumber, String make, String model, String numberSeats) {
        super(regNumber, make, model, numberSeats);
        setType("Sport");
    }

    public void displaySpeciality() {
        System.out.println("Accelerate!!! No Speed Radar can catch us!");
    }

}