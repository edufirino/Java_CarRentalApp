package model.car;

public abstract class Car {
    private String regNumber;
    private String make;
    private String model;
    private String numberSeats;

    private String type;
    static int idCounter = 1;
    public static String[] types = { "Luxury", "Sport", "Family" };

    public Car(String make, String model, String numberSeats) {
        this.regNumber = "IRL-" + idCounter;
        idCounter++;
        setMake(make);
        setModel(model);
        setNumberSeats(numberSeats);
    }

    public abstract void displaySpeciality();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(String numberSeats) {
        this.numberSeats = numberSeats;
    }
}
