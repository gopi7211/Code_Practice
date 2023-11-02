package DS.Stack;

public class StackUsingArray {
    final static  int MAX_SIZE = 20;
    int arr[] = new int[MAX_SIZE];
    int top;

    StackUsingArray(){
        top = -1;
    }

    public void push(int val){
        if(top == MAX_SIZE){
            throw new IndexOutOfBoundsException("Stack is full");
        }
        arr[++top] = val;
    }

    int pop() {
        if (top == -1) {
            throw new IndexOutOfBoundsException("Stack is empty");
        } else {
            return arr[top--];
        }
    }

    int peek(){
        return arr[top];
    }


}

