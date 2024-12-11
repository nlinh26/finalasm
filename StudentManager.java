import java.util.LinkedList;
import java.util.Random;

public class StudentManager {
    private LinkedList<Student> students;

    public StudentManager(int numStudents) {
        this.students = generateRandomStudents(numStudents);
    }

    // Generate random students
    private LinkedList<Student> generateRandomStudents(int numStudents) {
        LinkedList<Student> studentList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < numStudents; i++) {
            int id = i + 1; // ID from 1 to numStudents
            String name = "Student" + id; // Fake name
            String contactNumber = "09" + (random.nextInt(90000000) + 10000000); // Random contact number
            double marks = random.nextDouble() * 10; // Marks from 0 to 10
            studentList.add(new Student(id, name, contactNumber, marks));
        }
        return studentList;
    }

    // Convert LinkedList to array
    public Student[] toArray() {
        return students.toArray(new Student[0]);
    }

    // Print all students
    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Getter for the student list
    public LinkedList<Student> getStudents() {
        return students;
    }
}
