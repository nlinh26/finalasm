import java.util.Stack;

public class Main {

    // Kiểm tra xem stack có rỗng hay không
    public static boolean isStackEmpty(Stack<Integer> stack) {
        return stack.isEmpty();
    }

    // Thêm một phần tử vào stack
    public static void pushElement(Stack<Integer> stack, int value) {
        stack.push(value);
        System.out.println("Pushed element: " + value);
    }

    // Lấy và loại bỏ phần tử đỉnh của stack
    public static int popElement(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int poppedElement = stack.pop();
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        } else {
            System.out.println("Stack is empty");
            return -1;  // Lỗi: stack rỗng
        }
    }

    // Xem phần tử đỉnh của stack mà không loại bỏ
    public static int peekElement(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            System.out.println("Stack is empty");
            return -1;  // Lỗi: stack rỗng
        }
    }

    public static void main(String[] args) {
        // Tạo một stack mới
        Stack<Integer> stack = new Stack<>();

        // Kiểm tra nếu stack rỗng
        System.out.println("Is the stack empty? " + isStackEmpty(stack));

        // Thêm phần tử vào stack
        pushElement(stack, 10);
        pushElement(stack, 20);
        pushElement(stack, 30);

        // Xem phần tử đỉnh của stack
        System.out.println("Top element: " + peekElement(stack));

        // Lấy và loại bỏ phần tử đỉnh của stack
        popElement(stack);
        popElement(stack);

        // Kiểm tra lại stack sau khi đã loại bỏ các phần tử
        System.out.println("Is the stack empty? " + isStackEmpty(stack));

        // Cố gắng lấy phần tử đỉnh từ stack rỗng
        popElement(stack);
    }
}
