package Solver;

import Structures.Queue;

public class Restaurant {
    private Queue queue;
    private int lastStudent, maxLength;

    public Restaurant(int max_student){
        queue = new Queue(max_student);
        lastStudent = 0;
        maxLength = 0;
    }

    public void newStudent(int stu_id){
        queue.push(stu_id);
        if(maxLength < queue.length()){
            maxLength = queue.length();
        }
    }

    public void serve(){
        lastStudent = queue.pop();
    }

    public String answer(){
        return lastStudent + " " + maxLength;
    }
}
