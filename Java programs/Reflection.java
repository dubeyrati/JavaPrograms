import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) {
        // Get the class for which we want to perform reflection
        Class<?> clazz = SampleClass.class;

        // Display the class name
        System.out.println("Class Name: " + clazz.getName());

        // Display the declared methods of the class
        System.out.println("Methods:");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
        }
    }
}

class SampleClass {
    public void method1() {
        // Sample method 1
    }

    public int method2(String s, int n) {
        // Sample method 2
        return s.length() + n;
    }

    private void method3() {
        // Sample method 3 (private)
    }
}
