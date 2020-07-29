package com.lechowicz.stack;

public class Main {
    public static void main(String[] args) throws Exception{
        Stack<Integer> stack = new Stack<>(10);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        Integer item = stack.pop();
        while(item != null){
            System.out.print(item + " ");
            try{
                item = stack.pop();
            } catch (ArrayIndexOutOfBoundsException ex){
                break;
            }
        }
        System.out.println();
    }
}
