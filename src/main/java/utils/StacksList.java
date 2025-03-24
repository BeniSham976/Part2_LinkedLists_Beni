package utils;

import java.util.EmptyStackException;

public class StacksList {

    private int size;
    private Node first;

public StacksList(){
    this.size = 0;
    this.first = null;
}

//TODO: push()

//TODO: pop()

//TODO: peek()
    public String peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return first.data;
    }

//TODO: count()
    public int size(){
    return this.size;
}

//TODO: isEmpty()
    public boolean isEmpty(){
        return size == 0;
}

private static class Node{
    private Node next;
    private String data;
}
}
