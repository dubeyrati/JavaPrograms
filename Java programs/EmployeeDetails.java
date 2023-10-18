class Employee {
    private String name;
    private int employeeId;
    private String department;

    public Employee(String name, int employeeId, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee employee = new Employee("Yash Sharma", 12345, "IT");

        employee.displayDetails();
    }
}
