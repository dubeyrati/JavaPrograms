interface Stack {
    void push(int value);
    int pop();
}

class MyStack implements Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public MyStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("Pushed element: " + value);
        } else {
            System.out.println("Stack is full, can't push " + value);
        }
    }

    public int pop() {
        if (top >= 0) {
            int poppedElement = stackArray[top--];
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        } else {
            System.out.println("Stack is empty, can't pop");
            return -1;
        }
    }
}

public class StackInterface {
    public static void main(String[] args) {
        Stack stack = new MyStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // Stack is full, can't push 60

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // Stack is empty, can't pop
    }
}
