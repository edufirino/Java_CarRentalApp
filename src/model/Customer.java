package model;

public class Customer {

    private String id;
    private String name;
    private String creditCardNumber;
    private String dateOfBirth;

    static int idCounter = 1;

    public Customer(String name, String creditCardNumber, String dateOfBirth) {
        this.id = "" + idCounter;
        idCounter++;

        this.name = name;
        this.creditCardNumber = creditCardNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getId() {
        return id;
    }

}
