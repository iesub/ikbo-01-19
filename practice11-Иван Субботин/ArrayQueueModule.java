package ru.mirea.practice11;

public class ArrayQueueModule {
    private int size = 0;
    private Object[] array;

    public void rewriteArray(int size, int offset){
        Object[] bufferArray = new Object[size];
        if (array != null) {
            for (int i = 0; i < this.size - offset; i++) {
                bufferArray[i] = array[i + offset];
            }
        }
        array = bufferArray;
    }

    public void enqueue(Object element){
        rewriteArray(size + 1, 0);
        size++;
        array[size-1] = element;
    }

    public Object element(){
        if (size!=0) return array[0];
        else throw new IndexOutOfBoundsException();
    }

    public Object dequeue(){
        Object buffer = array[0];
        rewriteArray(size - 1, 1);
        size--;
        return(buffer);
    }

    public int size() {return size;}

    public void clear(){size = 0;}

    public boolean isEmpty(){return (size == 0);}
}
