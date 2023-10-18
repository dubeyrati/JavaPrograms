class Employee {
    private String name;
    private int id;

    // Constructor to initialize Employee details
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display Employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

class Manager extends Employee {
    private String department;

    // Constructor to initialize Manager details using super to call the parent constructor
    public Manager(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    // Method to display Manager details using super to call the parent method
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

public class EmployeeDetailsWithSuper {
    public static void main(String[] args) {
        Manager manager = new Manager("Amit Gupta", 123, "HR");
        System.out.println("Manager Details:");
        manager.displayDetails();
    }
}
