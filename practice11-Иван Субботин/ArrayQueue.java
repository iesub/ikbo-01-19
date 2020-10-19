package ru.mirea.practice11;

public class ArrayQueue {
    private static int size = 0;
    private static Object[] array;

    public static void rewriteArray(int size1, int offset){
        Object[] bufferArray = new Object[size1];
        if (array != null) {
            for (int i = 0; i < size - offset; i++) {
                bufferArray[i] = array[i + offset];
            }
        }
        array = bufferArray;
    }

    public static void enqueue(Object element){
        rewriteArray(size + 1, 0);
        size++;
        array[size-1] = element;
    }

    public static Object element(){
        if (size!=0) return array[0];
        else throw new IndexOutOfBoundsException();
    }

    public static Object dequeue(){
        Object buffer = array[0];
        rewriteArray(size - 1, 1);
        size--;
        return(buffer);
    }

    public static int size() {return size;}

    public static void clear(){size = 0;}

    public static boolean isEmpty(){return (size == 0);}
}
