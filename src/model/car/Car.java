package model.car;

public abstract class Car {
    private String regNumber;
    private String make;
    private String model;
    private String numberSeats;

    private String type;

    public static void main(String[] args) {
        Car c = new Luxury("123", "Honda", "Civic", "5");
        System.out.println(c.getType());
        System.out.println(c.getMake());
        System.out.println(c.getModel());
        System.out.println(c.getNumberSeats());
        c.displaySpeciality();

        c = new Family("789", "Fiat", "Uno", "6");
        System.out.println(c.getType());
        System.out.println(c.getMake());
        System.out.println(c.getModel());
        System.out.println(c.getNumberSeats());
        c.displaySpeciality();

        c = new Sport("456", "WolksWagen", "Gol", "7");
        System.out.println(c.getType());
        System.out.println(c.getMake());
        System.out.println(c.getModel());
        System.out.println(c.getNumberSeats());
        c.displaySpeciality();

    }

    public Car(String regNumber, String make, String model, String numberSeats) {
        setRegNumber(regNumber);
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
