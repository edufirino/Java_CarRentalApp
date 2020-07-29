package model.car;

public class Sport extends Car {

    public Sport(String make, String model, String numberSeats) {
        super(make, model, numberSeats);
        setType("Sport");
    }

    public void displaySpeciality() {
        System.out.println("Accelerate!!! No Speed Radar can catch us!");
    }

}