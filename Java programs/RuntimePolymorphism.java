class Shape {
    public double calculateArea() {
        return 0; 
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5);
        System.out.println("Area of Circle: " + shape1.calculateArea());

        Shape shape2 = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + shape2.calculateArea());

        Shape shape3 = new Triangle(4, 7);
        System.out.println("Area of Triangle: " + shape3.calculateArea());
    }
}

