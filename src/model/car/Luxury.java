package model.car;

public class Luxury extends Car {

    public Luxury(String regNumber, String make, String model, String numberSeats) {
        super(regNumber, make, model, numberSeats);
        setType("Luxury");
    }

    public void displaySpeciality() {
        System.out.println("Are you thirsty? I have some champagne in the fridge ;)");
    }

}