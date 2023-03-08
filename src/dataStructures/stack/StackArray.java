package dataStructures.stack;

public class StackArray {
    private int size;
    private int top;
    private int[] array;

    public boolean isEmpty(){
        return (top == -1);
    }

    public void push(int v){
        array[++top]=v;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        return array[top--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        return array[top];
    }

//      push();
//    peek();

    public StackArray(int s) {
        size = s;
        array = new int[size];
        top = -1;
    }


}
