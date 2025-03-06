package quiz3Task1;

import main.UserInputOutput;
import main.Util;

public class Employee {
    private String name;
    private double salary;
    public Employee() {}
    public void increaseSalary(double percent) {
        this.salary += percent * this.salary;
        System.out.println("Increase salary: " + this.salary);
    }

    public double getSalary() {
        System.out.println("Salary: " + this.salary);
        return salary;
    }
}
