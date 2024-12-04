import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.InputMismatchException;

// Lớp Sinh viên
class Student {
    int id;
    String name;
    double score;

    // Constructor
    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    // Hiển thị thông tin sinh viên
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Score: " + score);
    }
}

public class StudentManagementSystem {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Thêm sinh viên
    public static void addStudent(int id, String name, double score) {
        studentList.add(new Student(id, name, score));
    }

    // Cập nhật thông tin sinh viên
    public static void updateStudent(int id, String newName, double newScore) {
        for (Student student : studentList) {
            if (student.id == id) {
                student.name = newName;
                student.score = newScore;
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // Xóa sinh viên
    public static void deleteStudent(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).id == id) {
                studentList.remove(i);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    // Tìm kiếm sinh viên theo tên
    public static void searchStudentByName(String name) {
        boolean found = false;
        for (Student student : studentList) {
            if (student.name.equalsIgnoreCase(name)) {
                student.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No student found with the name: " + name);
        }
    }

    // Sắp xếp sinh viên theo điểm số (tăng dần)
    public static void sortStudentsByScore() {
        Collections.sort(studentList, (a, b) -> Double.compare(a.score, b.score));
        System.out.println("Students sorted by score:");
        displayAllStudents();
    }

    // Hiển thị tất cả sinh viên
    public static void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }
        for (Student student : studentList) {
            student.display();
        }
    }

    // Menu và nhập lựa chọn
    public static void showMenu() {
        System.out.println("Student Management System");
        System.out.println("1. Add Student");
        System.out.println("2. Update Student");
        System.out.println("3. Delete Student");
        System.out.println("4. Search Student by Name");
        System.out.println("5. Sort Students by Score");
        System.out.println("6. Display All Students");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    // Main method
    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  // Đọc ký tự dòng mới

            switch (choice) {
                case 1:
                    // Thêm sinh viên
                    try {
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();  // Đọc ký tự dòng mới
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Score: ");
                        double score = scanner.nextDouble();
                        addStudent(id, name, score);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter correct data types.");
                        scanner.nextLine();  // Đọc lại dòng để tránh lỗi tiếp theo
                    }
                    break;

                case 2:
                    // Cập nhật sinh viên
                    try {
                        System.out.print("Enter ID to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine();  // Đọc ký tự dòng mới
                        System.out.print("Enter New Name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter New Score: ");
                        double newScore = scanner.nextDouble();
                        updateStudent(updateId, newName, newScore);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter correct data types.");
                        scanner.nextLine();  // Đọc lại dòng để tránh lỗi tiếp theo
                    }
                    break;

                case 3:
                    // Xóa sinh viên
                    System.out.print("Enter ID to delete: ");
                    int deleteId = scanner.nextInt();
                    deleteStudent(deleteId);
                    break;

                case 4:
                    // Tìm kiếm sinh viên theo tên
                    scanner.nextLine();  // Đọc ký tự dòng mới
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    searchStudentByName(searchName);
                    break;

                case 5:
                    // Sắp xếp sinh viên theo điểm
                    sortStudentsByScore();
                    break;

                case 6:
                    // Hiển thị tất cả sinh viên
                    displayAllStudents();
                    break;

                case 7:
                    // Thoát
                    System.out.println("Exiting system...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
