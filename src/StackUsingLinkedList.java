import java.util.LinkedList;

public class StackUsingLinkedList {

    // Tạo lớp Stack sử dụng LinkedList
    static class Stack {
        LinkedList<Integer> list = new LinkedList<>();

        // Kiểm tra xem stack có rỗng hay không
        public boolean isEmpty() {
            return list.isEmpty();
        }

        // Thêm một phần tử vào stack (push operation)
        public void push(int value) {
            list.addFirst(value);  // Thêm vào đầu LinkedList
            System.out.println("Pushed element: " + value);
        }

        // Lấy và loại bỏ phần tử đỉnh của stack (pop operation)
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;  // Stack rỗng
            }
            int poppedElement = list.removeFirst();  // Xóa phần tử đầu tiên
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        }

        // Xem phần tử đỉnh mà không loại bỏ nó (peek operation)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int topElement = list.getFirst();  // Lấy phần tử đầu tiên mà không xóa
            System.out.println("Top element: " + topElement);
            return topElement;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        // Thêm phần tử vào stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Xem phần tử đỉnh
        stack.peek();

        // Lấy phần tử đỉnh
        stack.pop();

        // Kiểm tra stack có rỗng không
        boolean empty = stack.isEmpty();
        System.out.println("Is the stack empty? " + empty);
    }
}

