package data.structures.and.algorithums;

import java.util.Stack;

public class DataStructuresAndAlgorithums {

    public static void main(String[] args) {
        //lets start off by creating a stack, them by using javas built in stack

        stack myStack = new stack();
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);

        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }

        System.out.println("");
        
        
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

}
