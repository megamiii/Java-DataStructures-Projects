package Structures;

public class Queue {
    private int[] arr;
    private int head, tail;

    public Queue(int max_len){
        arr = new int[max_len + 1];
        head = 0;
        tail = 0;
    }

    public void clear(){
        head = 0;
        tail = 0;
    }

    public boolean isempty(){
        if (tail == head)
            return true;
        else return false;
    }

    public int length(){
        return tail - head;
    }

    public void push(int val){
        if(tail == arr.length){
            tail = 0;
        }
        arr[tail++] = val;
    }

    public int pop(){
        if(head == arr.length){
            head = 0;
        }
        int temp = arr[head++];
        return temp;
    }
}