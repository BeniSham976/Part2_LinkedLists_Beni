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
public void push(String data){
    if(data == null){
        throw new IllegalArgumentException("Nulls are not permitted in the stack");
    }

    Node newNode = new Node(data);
    newNode.next = first;
    first = newNode;
    size++;
}

//TODO: pop()
    public String pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        String removed = first.data;
        first = first.next;
        size--;
        return removed;
    }

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

        public Node(String data){
            this.data = data;
            this.next = null;
        }
    }
}
