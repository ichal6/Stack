package com.lechowicz.stack;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Stack<E> {
    private final Object[] stack;
    private int index;

    public Stack(int maxSize){
        this.stack = new Object[maxSize];
        this.index = -1;
    }

    public void push(E item){
        this.stack[++index] = (E) item;
    }

    public E pop(){
        E returnItem = null;
        returnItem = (E) this.stack[index--];

        return returnItem;
    }

    public E peek(){
        E returnItem = null;
        returnItem = (E) this.stack[index];

        return returnItem;
    }

}
