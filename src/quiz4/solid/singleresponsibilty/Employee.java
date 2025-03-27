package quiz4.solid.singleresponsibilty;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}


class EmployeeSalaryCalculator {
    public double calculateSalary(Employee employee) {
        return employee.getSalary();
    }
}

// İşçini fayla yazma funksiyasını ayrıca sinifə ayırırıq
class EmployeeFileSaver {
    public void saveEmployeeToFile(Employee employee) {
        System.out.println("Saving employee " + employee.getName() + " to file.");
    }
}