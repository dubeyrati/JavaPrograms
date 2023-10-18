// Parent class
class Parent {
    int parentVar = 10;

    // Constructor in the parent class
    Parent() {
        System.out.println("This is the parent class constructor.");
    }

    // Method in the parent class
    void parentMethod() {
        System.out.println("This is the parent class method.");
    }
}

// Child class
class Child extends Parent {
    int childVar = 20;

    // Constructor in the child class
    Child() {
        super(); // Calling the parent class constructor
        System.out.println("This is the child class constructor.");
    }

    // Method in the child class that overrides the parent method
    void parentMethod() {
        super.parentMethod(); // Calling the parent class method
        System.out.println("This method overrides the parent method.");
    }

    // Method using super to access the parent variable
    void accessParentVariable() {
        System.out.println("Parent variable from child class: " + super.parentVar);
    }
}

// Main class
public class SuperKeyword {
    public static void main(String[] args) {
        // Usage 1: Calling the parent class constructor using super
        Child child = new Child();
        System.out.println();

        // Usage 2: Calling the parent class method using super
        child.parentMethod();
        System.out.println();

        // Usage 3: Accessing the parent class variable using super
        child.accessParentVariable();
    }
}

