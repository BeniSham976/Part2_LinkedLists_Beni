package utils;

/**
 *
 * @author Beni
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

    /**
     * Returns the number of elements present in the list
     * @return The number of elements present in the list
     */
    public int size(){
        return numElements;
    }

    /**
     * @param pos Represents the position of the song to be found
     * @return An integer to indicate the position of where the song can be found
     */
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

    /**
     * @param Song the Song object that will be found by the index of its position on the list
     * @return the song object found at the specified position
     */
    public int indexOf(Object Song){
        //Validate
        if (Song == null){
            throw new IllegalArgumentException("Song list cannot handle null vales");
        }
        Field current = first;
        for (int i = 0; i < numElements; i++) {
            if (Song.equals(current.data)){
                return i;
            }
            current = current.next;
        }
        //Else if no match was found, return -1
        return -1;
    }

    /**
     * Return true if the list has no elements inside
     * @return True if the list has no elements, otherwise it's false
     */
    public boolean isEmpty(){
        return numElements == 0;
    }

    /**
     * Returns the last element inside the list
     * @return The last element inside the list
     */
    public Field tail(){
        return last;
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
