package arrays;

public class stackusingarray 
{
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public stackusingarray(int capacity) 
    {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    // Push operation
    public void push(int value) 
    {
        if (isFull()) {
            System.out.println("Stack Overflow. Unable to push " + value);
            return;
        }
        stack[++top] = value;
    }

    // Pop operation
    public int pop() 
    {
        if (isEmpty()) {
            System.out.println("Stack Underflow. Unable to pop.");
            return -1; // or throw an exception
        }
        return stack[top--];
    }

    // Peek operation
    public int peek() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is empty.");
            return -1; // or throw an exception
        }
        return stack[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Return the size of the stack
    public int size() {
        return top + 1;
    }

    // Main method to test the stack implementation
    public static void main(String[] args) {
        stackusingarray stack = new stackusingarray(5); // Create a stack with capacity 5

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek()); // Output: 30
        System.out.println("Stack size: " + stack.size()); // Output: 3

        System.out.println("Popped element: " + stack.pop()); // Output: 30
        System.out.println("Stack size after pop: " + stack.size()); // Output: 2

        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println("Is stack full? " + stack.isFull()); // Output: true

        stack.push(70); // This should display "Stack Overflow. Unable to push 70"
    }
}
