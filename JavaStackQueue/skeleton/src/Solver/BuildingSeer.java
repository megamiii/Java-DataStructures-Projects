package Solver;

import Structures.Stack;

public class BuildingSeer{
    private Stack stack;

    public BuildingSeer(int max_bd){
        stack = new Stack(max_bd);
    }

    public void newBuilding(int height){
        stack.push(height);
    }

    public int visibleBuildingNum(){
        int cnt = 0;
        int max = 0;
        int temp = 0;
        while (!stack.isempty()){
            temp = stack.pop();
            if (temp > max){
                cnt++;
                max = temp;
            }
        }
        return cnt;
    }
}
