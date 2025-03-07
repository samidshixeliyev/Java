package quiz3Task4_2;

public class Main {
    public static void main(String[] args) {
        Employee fullTimeEmp = new FullTimeEmployee("Elvin", 3000); // Tam ştatlı işçi
        Employee partTimeEmp = new PartTimeEmployee("Aysel", 15, 80); // Saatlıq işləyən işçi

        System.out.println(fullTimeEmp.getName() + " üçün maaş: " + fullTimeEmp.calculateSalary() + " AZN");
        System.out.println(partTimeEmp.getName() + " üçün maaş: " + partTimeEmp.calculateSalary() + " AZN");
        Student student = new Student("Aysel", 19);
        Student student2 = new Student("Elvin", 22);
        Student.displayTotalStudents();
        student.displayInfo();
        student2.displayInfo();
        int num1 = 3;
        int num2 = 5;

        System.out.println(num1 + " ədədinin kvadratı: " + MathUtils.square(num1));
        System.out.println(num1 + " ədədinin kubu: " + MathUtils.cube(num1));

        System.out.println(num2 + " ədədinin kvadratı: " + MathUtils.square(num2));
        System.out.println(num2 + " ədədinin kubu: " + MathUtils.cube(num2));

    }
}
