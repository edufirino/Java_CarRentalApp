package model;

public class Customer {

    private String name;
    private String creditCardNumber;
    private String dateOfBirth;

    public Customer(String name, String creditCardNumber, String dateOfBirth) {
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

}
