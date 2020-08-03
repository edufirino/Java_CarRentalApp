package model.car;

public class Family extends Car {
    public Family(String make, String model, String numberSeats) {
        super(make, model, numberSeats);
        setType("Family");
    }

    public void displaySpeciality() {
        System.out.println(
                "Family Car Speciality: You have 5 kids and it's grocery time? Don't worry I have ALL the space you need!");
    }
}