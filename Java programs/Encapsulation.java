class Student {
    private String name;
    private int age;
    private String studentId;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Amit Yadav");
        student.setAge(20);
        student.setStudentId("S12345");

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student ID: " + student.getStudentId());
    }
}
