package graph.it_fun;

import java.util.Arrays;

public class MyStack {
    private int size = 10;
    private int top;
    private int[] array;

    public MyStack(){
        array = new int[size];
        top =-1; // минус 1 показывает что стек пуст
    }

    public void push(int v){
        array[++top]=v;
    }
    public int pop(){
        return array[top--];
    }
    public int peek(){
        return array[top];
    }
    public boolean isEmpty(){
        if (top==-1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "size=" + size +
                ", top=" + top +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
