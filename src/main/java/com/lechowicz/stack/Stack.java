package com.lechowicz.stack;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Stack<E> {
    private final LinkedList<E> stack;

    public Stack(){
        this.stack = new LinkedList<>();
    }

    public void push(E item){
        this.stack.add(item);
    }

    public E pop(){
        E returnItem = null;
        try{
            returnItem = this.stack.getLast();
            this.stack.removeLast();
        } catch (NoSuchElementException ex){
            return null;
        }
        return returnItem;
    }

    public E peek(){
        E returnItem = null;
        try{
            returnItem = this.stack.getLast();
        } catch (NoSuchElementException ex){
            return null;
        }
        return returnItem;
    }

}
