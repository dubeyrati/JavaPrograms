// java Program for Student mark list display using class and methods
import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private int[] marks;

    public Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void displayMarkList() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }
}

public class StudentMarkList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

        int numberOfSubjects = 5; 
        int[] marks = new int[numberOfSubjects];
        System.out.println("Enter marks for each subject: ");
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Subject " + (i + 1) + " : ");
            marks[i] = scanner.nextInt();
        }

        Student student = new Student(name, rollNumber, marks);
        System.out.println("Mark list for the student:");
        student.displayMarkList();
    }
}
