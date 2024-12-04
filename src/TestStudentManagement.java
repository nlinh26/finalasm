public class TestStudentManagement {
    public static void main(String[] args) {
        // Tạo đối tượng quản lý sinh viên
        StudentManagementSystem system = new StudentManagementSystem();

        // Test Case 1: Nhập tên sinh viên rỗng
        try {
            system.addStudent(1, "", 85.5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); // Expected: "Name cannot be empty"
        }

        // Test Case 2: Nhập điểm không hợp lệ
        try {
            system.addStudent(2, "John Doe", -5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); // Expected: "Score cannot be negative"
        }

        // Test Case 3: Tìm kiếm sinh viên không tồn tại
        try {
            system.searchStudentByName("Nonexistent Student");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage()); // Expected: "Student not found"
        }
    }
}
