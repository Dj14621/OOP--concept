import employees.Employee;
import employees.Manager;
import employees.Programmer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to employee project");
        Employee employee1 = new Employee(50000, "Mike", "1234");
        Employee employee2 = new Employee(40000, "Shawn", "1235");
        Manager manager = new Manager(200000.77, "Adam", "4567", 100000.55);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(manager);
        //Update Salary
        updateSalary(employee1);
        System.out.println(employee1);
    }

    public static void updateSalary(Employee employee) {
        Scanner scanner = new Scanner(System.in);
        double newSalary;
        System.out.println("Please enter your new salary!");
        newSalary = scanner.nextDouble();
        employee.setSalary(newSalary);
    }
    
}
