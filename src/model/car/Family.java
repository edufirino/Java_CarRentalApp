package model.car;

public class Family extends Car {
    public Family(String make, String model, String numberSeats) {
        super(make, model, numberSeats);
        setType("Family");
    }

    public void displaySpeciality() {
        System.out.println("You have 5 kids and it's grocery time? Don't worry I've ALL the space you need!");
    }
}