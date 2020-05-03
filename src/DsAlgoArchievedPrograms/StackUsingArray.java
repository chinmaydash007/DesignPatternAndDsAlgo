package DsAlgoArchievedPrograms;

public class StackUsingArray {
    private int top = -1;
    private int arr[];

    public StackUsingArray(int capacity) {
        arr = new int[capacity];
    }

    public void push(int val) {
        if (top == arr.length - 1) {
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = val;
    }

    public int pop() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[top--];

    }

    public int peek() {
        if (top == -1) {
            return -1;
        }
        return arr[top];
    }


}
