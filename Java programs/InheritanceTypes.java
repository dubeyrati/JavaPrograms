// Single Inheritance
class Parent {
    void showParent() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("This is the child class.");
    }
}

// Multilevel Inheritance
class Grandparent {
    void showGrandparent() {
        System.out.println("This is the grandparent class.");
    }
}

class Parent2 extends Grandparent {
    void showParent2() {
        System.out.println("This is the parent2 class.");
    }
}

class Child2 extends Parent2 {
    void showChild2() {
        System.out.println("This is the child2 class.");
    }
}

// Hierarchical Inheritance
class Base {
    void showBase() {
        System.out.println("This is the base class.");
    }
}

class ChildA extends Base {
    void showChildA() {
        System.out.println("This is the ChildA class.");
    }
}

class ChildB extends Base {
    void showChildB() {
        System.out.println("This is the ChildB class.");
    }
}

// Multiple Inheritance using Interfaces
interface Interface1 {
    void showInterface1();
}

interface Interface2 {
    void showInterface2();
}

class MultipleInheritanceClass implements Interface1, Interface2 {
    public void showInterface1() {
        System.out.println("This is Interface1.");
    }

    public void showInterface2() {
        System.out.println("This is Interface2.");
    }
}

// Main class
public class InheritanceTypes {
    public static void main(String[] args) {
        // Single Inheritance
        Child child = new Child();
        child.showParent();
        child.showChild();
        System.out.println();

        // Multilevel Inheritance
        Child2 child2 = new Child2();
        child2.showGrandparent();
        child2.showParent2();
        child2.showChild2();
        System.out.println();

        // Hierarchical Inheritance
        ChildA childA = new ChildA();
        childA.showBase();
        childA.showChildA();
        System.out.println();

        ChildB childB = new ChildB();
        childB.showBase();
        childB.showChildB();
        System.out.println();

        // Multiple Inheritance using Interfaces
        MultipleInheritanceClass multipleInheritanceClass = new MultipleInheritanceClass();
        multipleInheritanceClass.showInterface1();
        multipleInheritanceClass.showInterface2();
    }
}
