package employees;

public class Employee {


    // Fields
    private double salary;
    private String name;
    private String employeeid;
    //Constructors

    public Employee() {
    }

    public Employee(double salary, String name, String employeeid) {
        this.salary = salary;
        this.name = name;
        this.employeeid = employeeid;
    }

    //Getters and Setters

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    //Methods
    public boolean isFullTime() {
        return true;
    }

    //To Strings
    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", employeeid='" + employeeid + '\'' +
                '}';
    }
}
