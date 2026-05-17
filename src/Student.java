public class Student {
    private int id;
    private String name;
    private String major;
    private double gpa;

    public Student(int id, String name, String major, double gpa){
        this.id= id;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }
    public int getId(){
        return id;
    }
    public String toString(){
        return "ID: " + id +
                " | Name: " + name +
                " | Major: " + major +
                " | GPA: " + gpa;
    }

}
