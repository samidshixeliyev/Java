package quiz3Task4_2;

public class FullTimeEmployee extends Employee {
    private double salary;
    public FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }
    @Override
    public double calculateSalary() {
        return salary; // Tam ştatlı işçi üçün sabit maaş
    }

}
