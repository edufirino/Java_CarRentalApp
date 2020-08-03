package model.car;

public class Luxury extends Car {

    public Luxury(String make, String model, String numberSeats) {
        super(make, model, numberSeats);
        setType("Luxury");
    }

    public void displaySpeciality() {
        System.out.println("Luxury Car Speciality: Are you thirsty? I have some champagne in the fridge ;)");
    }

}