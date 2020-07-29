package model.staff;

public abstract class Staff {

    public static void main(String[] args) {
        Staff s = new Receptionist("Andrea");

        System.out.println(s.getName());
        System.out.println(s.getId());
        System.out.println(s.getSalaryLevel());
        System.out.println(s.getTask());

        s = new ITNerd("Malk");

        System.out.println(s.getName());
        System.out.println(s.getId());
        System.out.println(s.getSalaryLevel());
        System.out.println(s.getTask());

        s = new CEO("Eddie");

        System.out.println(s.getName());
        System.out.println(s.getId());
        System.out.println(s.getSalaryLevel());
        System.out.println(s.getTask());

    }

    private String name;
    private String id;
    private String salaryLevel;
    private String task;

    static int idCounter = 1;

    public Staff(String name) {
        this.id = "" + idCounter;
        idCounter++;
        this.name = name;
    }

    public String getTask() {
        return this.task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalaryLevel() {
        return salaryLevel;
    }

    public void setSalaryLevel(String salaryLevel) {
        this.salaryLevel = salaryLevel;
    }

    public String getId() {
        return id;
    }

}
