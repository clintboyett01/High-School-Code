
package data.structures.and.algorithums;

import java.util.ArrayList;


public class stack {
    private ArrayList<Integer> al = new ArrayList<>();
    private int top = -1;
    
    public void push(int n){
        al.add(n);
        top++;
    }
    
    public int peek(){
        return al.get(top);
    }
    
    public int pop(){
        top--;
        return al.get(top+1);
        
    }
    
    public boolean isEmpty(){
        return (top==-1);
    }
}
