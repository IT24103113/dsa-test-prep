package stack;

public class stackArray {
    private int stackSize;
    private int[] stackArray;
    private int top;

    public stackArray(int stackSize) {
        this.stackSize = stackSize;
        stackArray = new int[stackSize];
        top=-1;
    }

    public  boolean isFull() {
        if(top==stackSize-1) {
            return true;
        } else {
            return false;
        }
    }

    public  boolean isEmpty() {
        if(top==-1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int value) {
        if(isFull()==true) {
            System.out.println("Stack is full");
        } else {
            top++;
            stackArray[top]=value;
        }

    }

    public int pop() {
        if(isEmpty()==true) {
            return -99;
        } else {
            top--;
            return stackArray[top];
        }

    }
    public void peek() {
        if(isEmpty()==true) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(stackArray[top]);
        }
    }

    public static void main(String[] args) {
        stackArray stack =new stackArray(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        stack.pop();
        stack.pop();

        stack.peek();


    }
}
