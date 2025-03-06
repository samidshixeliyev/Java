package quiz3Task1;

public class Student {
    private String name;
    private int grade;
    public void setGrade(int grade) {
        if(grade >= 0 && grade <= 100){
        this.grade = grade;
     } else {
            System.out.println("Yalnış qiymət");
        }
    }
    public void setName(String name){
        this.name = name;
    }
}
