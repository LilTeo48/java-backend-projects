import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student added successfully");
    }

    public void viewStudents(){
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for(Student student : students){
            System.out.println(student);
        }
    }
    public void searchStudentById(int id){
        for (Student student : students){
            if (student.getId() == id){
                System.out.println("Student found.");
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found.");
    }
    public void removeStudentById(int id){
        for (Student student : students){
            if(student.getId() == id){
                students.remove(student);
                System.out.println("Student removed successfully.");
                return;
            }
        }
        System.out.println("Student not found");
    }
}
