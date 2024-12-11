import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        StudentManager studentManager = new StudentManager(numStudents);
        Student[] bubbleSortArray = studentManager.toArray();
        Student[] quickSortArray = bubbleSortArray.clone();

        StudentStack stack = new StudentStack();
        StudentStack stack2 = new StudentStack();


        for (Student student : bubbleSortArray) {
            stack.push(student);
        }
        for (Student student : quickSortArray) {
            stack2.push(student);
        }



        BubbleSort bubbleSort = new BubbleSort();
        long startTime = System.nanoTime();
        bubbleSort.sort(bubbleSortArray);
        long endTime = System.nanoTime();
        long bubbleSortTime = endTime - startTime;

        QuickSort quickSort = new QuickSort();
        startTime = System.nanoTime();
        quickSort.sort(quickSortArray);
        endTime = System.nanoTime();
        long quickSortTime = endTime - startTime;

        // In thời gian thực thi
        System.out.println("Bubble Sort Time: " + bubbleSortTime + " nanoseconds");
        System.out.println("Quick Sort Time: " + quickSortTime + " nanoseconds");

        // In danh sách sinh viên đã sắp xếp
        System.out.println("\nStudents sorted by Bubble Sort:");
        Arrays.stream(bubbleSortArray).forEach(System.out::println);

        System.out.println("\nStudents sorted by Quick Sort:");
        Arrays.stream(quickSortArray).forEach(System.out::println);

        scanner.close();
    }
}
