package com.lechowicz.stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        Integer item = stack.pop();
        while(item != null){
            System.out.print(item + " ");
            item = stack.pop();
        }
        System.out.println();
    }
}
