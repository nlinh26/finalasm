class StudentStack {
    private Node top;

    // Node class to represent each stack element
    private static class Node {
        Student student;
        Node next;

        Node(Student student) {
            this.student = student;
            this.next = null;
        }
    }

    // Push a student onto the stack
    public void push(Student student) {
        Node newNode = new Node(student);
        newNode.next = top;
        top = newNode;
    }

    // Pop a student from the stack
    public Student pop() {
        if (top == null) return null;
        Student poppedStudent = top.student;
        top = top.next;
        return poppedStudent;
    }

    // Peek the top student of the stack
    public Student peek() {
        return (top != null) ? top.student : null;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display the stack
    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.println(current.student);
            current = current.next;
        }
    }
}
