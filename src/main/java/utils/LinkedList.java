package utils;

/**
 *
 * @author michelle
 */
public class LinkedList {
    private int numElements;


    private Field first;
    private Field last;

    public LinkedList(){
        this.first = null;
        this.last = null;
        this.numElements = 0;
    }

    public int size(){
        return numElements;
    }

    public String get(int pos){
        //Validate
        if(pos < 0 || pos >= numElements){
            throw new IndexOutOfBoundsException("Position must be between 0 and " + numElements + ". Supplied position was: " + pos);
        }
    Field current = first;
        for (int i = 0; i < pos; i++) {
            current = current.next;
        }
        return current.data;
    }

    public boolean isEmpty(){
        return numElements == 0;
    }

    private static class Field{
        private String data;
        private Field next;

        public Field(String data){
            this.data = data;
            this.next = null;
        }
    }
}
