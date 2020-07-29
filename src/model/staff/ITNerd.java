package model.staff;

public class ITNerd extends Staff {

    public ITNerd(String name) {
        super(name);
        this.setTask(Tasks.FIX_KEYBOARD.DES());
        this.setSalaryLevel("Medium =|");
    }
}