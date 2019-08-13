package Stack;

import java.util.Scanner;

class client {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word that you would like to reverse");
        String word = sc.nextLine();
        String revWord = reverse(word);
        System.out.println(revWord);
        
        
    }
    
    public static String reverse(String s){
        charStack cs = new charStack(s.length());
        char [] word = s.toCharArray();
        String revWord = "";
        for(char el: word){
            cs.push(el);
        }
        while(!cs.isEmpty()){
            revWord = revWord + cs.pop();
        }
        return revWord;
    }
}

public class Stack {

    private int maxSize;
    private int top;
    private int[] starr;

    public Stack(int max_size) {
        maxSize = max_size;
        top = -1;
        starr = new int[maxSize];
    }

    public void push(int n) {
        if (isFull()) {
            System.out.println("Stack is full!");
        } else {
            top++;
            starr[top] = n;
            
        }
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            int poped = starr[top];
            top--;
            return poped;
        }
    }

    public int peek() {
        return starr[top];
    }

    public boolean isFull() {
        return ((maxSize-1) == top);
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
class charStack {

    private int maxSize;
    private int top;
    private char[] starr;

    public charStack(int max_size) {
        maxSize = max_size;
        top = -1;
        starr = new char[maxSize];
    }

    public void push(char n) {
        if (isFull()) {
            System.out.println("Stack is full!");
        } else {
            top++;
            starr[top] = n;
        }
    }
    
    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return '@' ;
        } else {
            char poped = starr[top];
            top--;
            return poped;
        }
    }

    public char peek() {
        return starr[top];
    }

    public boolean isFull() {
        return ((maxSize-1) == top);
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
