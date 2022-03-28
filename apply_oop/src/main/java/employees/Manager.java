package employees;

public class Manager extends Employee{

    private double bonus;

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
    //Constructors


    public Manager() {
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(double salary, String name, String employeeid, double bonus) {
        super(salary, name, employeeid);
        this.bonus = bonus;
    }
    //Methods
    public String sickLeave(){
        return "I have 10 sick leave days";
    }
    //ToString

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                '}';
    }
}
