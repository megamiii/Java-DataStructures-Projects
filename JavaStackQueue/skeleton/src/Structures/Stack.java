package Structures;

public class Stack{
    // FILL HERE
    private int[] arr;
    private int topIndex;

    public Stack(int max_len){
        // FILL HERE
        arr = new int[max_len];
        topIndex = 0;
    }

    public void clear(){
        // FILL HERE
        topIndex = 0;
    }

    public boolean isempty(){
        // FILL HERE
        if (topIndex == 0)
            return true;
        else return false;
    }

    public int length(){
        // FILL HERE
        return topIndex;
    }

    public void push(int val){
        // FILL HERE
        arr[topIndex++] = val;
    }

    public int pop(){
        // FILL HERE
        return arr[--topIndex];
    }
}