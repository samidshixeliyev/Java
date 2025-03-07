package quiz3Task4_2;

public  abstract class Employee {
    private String name;


    public  Employee(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    // Abstrakt metod - hər işçinin maaş hesablaması fərqli olacaq
    public abstract double calculateSalary();
}
