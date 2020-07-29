package com.lechowicz.stack;

public class Stack<E> {
    private final Object[] stack;
    private int index;

    public Stack(int maxSize){
        this.stack = new Object[maxSize];
        this.index = -1;
    }

    public E push(E value) throws Exception{
        try{
            this.stack[++index] = (E) value;
        } catch(ArrayIndexOutOfBoundsException ex){
            index--;
            throw new Exception(ex);
        }
        return (E) this.stack[index];
    }

    public E pop() throws Exception{
        E returnItem = null;
        try{
            returnItem = (E) this.stack[index--];
        } catch(ArrayIndexOutOfBoundsException ex){
            index = -1;
            throw new Exception(ex);
        }
        return returnItem;
    }

    public E peek() throws Exception{
        E returnItem = null;
        try{
            returnItem = (E) this.stack[index];
        } catch(ArrayIndexOutOfBoundsException ex){
            throw new Exception(ex);
        }
        return returnItem;
    }

    public boolean isEmpty(){
        return index == -1;
    }
}
