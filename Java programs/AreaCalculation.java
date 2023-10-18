class AreaCalculator {
    private double area;

    // Constructor for Circle
    public AreaCalculator(double radius) {
        this.area = Math.PI * radius * radius;
    }

    // Constructor for Square
    public AreaCalculator(int side) {
        this.area = side * side;
    }

    // Constructor for Rectangle
    public AreaCalculator(int length, int width) {
        this.area = length * width;
    }

    // Constructor for Cone
    public AreaCalculator(double radius, double height) {
        this.area = Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    // Constructor for Triangle
    public AreaCalculator(double base, double height, String figure) {
        if (figure.equals("Triangle")) {
            this.area = 0.5 * base * height;
        }
    }

    public double getArea() {
        return area;
    }
}

public class AreaCalculation {
    public static void main(String[] args) {
        AreaCalculator circleArea = new AreaCalculator(5.0);
        System.out.println("Area of the Circle: " + circleArea.getArea());

        AreaCalculator squareArea = new AreaCalculator(4);
        System.out.println("Area of the Square: " + squareArea.getArea());

        AreaCalculator rectangleArea = new AreaCalculator(4, 5);
        System.out.println("Area of the Rectangle: " + rectangleArea.getArea());

        AreaCalculator coneArea = new AreaCalculator(3.0, 4.0);
        System.out.println("Surface Area of the Cone: " + coneArea.getArea());

        AreaCalculator triangleArea = new AreaCalculator(4.0, 6.0, "Triangle");
        System.out.println("Area of the Triangle: " + triangleArea.getArea());
    }
}
