class Student {
    private String name;
    private int rollNumber;

    // Method 1: Using a constructor
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Method 2: Using setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Method 3: Using default constructor and setter methods
    public Student() {
    }

    public void setDetails(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class ObjectInitialization {
    public static void main(String[] args) {
        // Method 1: Using a constructor
        Student student1 = new Student("Anil", 1);
        System.out.println("Details of student1:");
        student1.displayDetails();
        System.out.println();

        // Method 2: Using setter methods
        Student student2 = new Student();
        student2.setName("Aman");
        student2.setRollNumber(2);
        System.out.println("Details of student2:");
        student2.displayDetails();
        System.out.println();

        // Method 3: Using default constructor and setter methods
        Student student3 = new Student();
        student3.setDetails("Akash", 3);
        System.out.println("Details of student3:");
        student3.displayDetails();
    }
}
