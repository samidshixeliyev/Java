package quiz4.solid.dependency_inversion_principle;

// DIP prinsipinə uyğun interfeys yaradılır
interface Calculator {
    double calculateSalary(Employee employee);
}

// SalaryCalculator interfeysdən implement edir
class SalaryCalculator implements Calculator {
    @Override
    public double calculateSalary(Employee employee) {
        // Salary calculation logic
        return 1000.0;
    }
}

// EmployeeService artıq konkret SalaryCalculator-a deyil, interfeysə bağlıdır
class EmployeeService {
    private Calculator calculator;

    // Constructor-dan Calculator qəbul edirik (Dependency Injection)
    public EmployeeService(Calculator calculator) {
        this.calculator = calculator;
    }

    public double getSalary(Employee employee) {
        return calculator.calculateSalary(employee);
    }
}

// Employee sinfi (sade bir model kimi)
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Test
public class Main {
    public static void main(String[] args) {
        Calculator salaryCalculator = new SalaryCalculator();
        EmployeeService employeeService = new EmployeeService(salaryCalculator);

        Employee employee = new Employee("John Doe");
        System.out.println("Salary: " + employeeService.getSalary(employee));
    }
}
