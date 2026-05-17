import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true){
            System.out.println("\n=== Student Database System === ");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Remove Student by ID");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter student major: ");
                    String major = scanner.nextLine();

                    System.out.print("Enter student GPA: ");
                    double gpa = scanner.nextDouble();

                    Student student = new Student(id, name, major, gpa);
                    manager.addStudent(student);
                    break;
                case 2:
                manager.viewStudents();
                break;

                case 3:
                    System.out.print("Enter student ID to search: ");
                    int searchId = scanner.nextInt();
                    manager.searchStudentById(searchId);
                    break;
                case 4:
                    System.out.print("Enter student ID to remove: ");
                    int removeId = scanner.nextInt();
                   manager.removeStudentById(removeId);
                    break;
                case 5:
                    System.out.println("Exiting program... ");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }

        }
    }
}