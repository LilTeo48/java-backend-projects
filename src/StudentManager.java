import java.util.ArrayList;
import java.util.Comparator;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student){
       if(findStudentById(student.getId()) != null){
           System.out.println("Student ID already exists.");
           return;
       }
       students.add(student);
       System.out.println("Student added successfully.");
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
        Student student = findStudentById(id);

        if(student == null){
            System.out.println("Student not found.");
            return;
        }
        System.out.println("Student found.");
        System.out.println(student);
    }

    public void updateStudentById(int id, String name, String major, double gpa){
        Student student = findStudentById(id);

        if(student == null){
            System.out.println("Student not found.");
            return;
        }
        student.setName(name);
        student.setMajor(major);
        student.setGpa(gpa);

        System.out.println("Student updated successfully.");
    }
    public void removeStudentById(int id){
       Student student = findStudentById(id);

       if(student == null){
           System.out.println("Student not found.");
           return;
       }
       students.remove(student);
       System.out.println("Student removed successfully.");
    }

    public void displayStudentCount(){
        System.out.println("Total students: " + students.size());
    }
    public void sortStudentsByGpa(){
        if(students.isEmpty()){
            System.out.println("No students found.");
            return;
        }
        students.sort(
                Comparator.comparingDouble(Student::getGpa).reversed()
        );

        System.out.println("Students sorted by GPA (Highest to Lowest).");

        viewStudents();
    }
    public void searchStudentByName(String name){
        boolean found = false;

        for (Student student : students){
            if(student.getName().toLowerCase().contains(name.toLowerCase())){
                System.out.println(student);
                found = true;
            }
        }
        if(!found){
            System.out.println("Student not found.");
        }
    }

    private Student findStudentById(int id){
    for(Student student : students){
        if(student.getId() == id){
            return student;
        }
    }

    return null;
    }
}
