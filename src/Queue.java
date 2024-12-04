
public class Queue {
    private Node front, rear;

    public Queue() {
        front = rear = null;
    }

    // Enqueue operation
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Enqueued: " + value);
    }

    // Dequeue operation
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1; // Queue is empty
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        System.out.println("Dequeued: " + value);
        return value;
    }

    // Peek operation (view the front element)
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1; // Queue is empty
        }
        return front.data;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }
}

