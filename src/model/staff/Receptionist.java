package model.staff;

public class Receptionist extends Staff {

    public Receptionist(String name) {
        super(name);
        this.setType("Receptionist");
        this.setTask(Tasks.PHONE_CALL.DES());
        this.setSalaryLevel("Low.... =( ");
    }
}