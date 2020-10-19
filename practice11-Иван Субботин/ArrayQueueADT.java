package ru.mirea.practice11;

public class ArrayQueueADT {
    private int size = 0;
    private Object[] array;

    public void rewriteArray(ArrayQueueADT queue, int size, int offset){
        Object[] bufferArray = new Object[size];
        if (queue.array != null) {
            for (int i = 0; i < queue.size - offset; i++) {
                bufferArray[i] = queue.array[i + offset];
            }
        }
        array = bufferArray;
    }

    public void enqueue(ArrayQueueADT queue, Object element){
        rewriteArray(queue,queue.size + 1, 0);
        queue.size++;
        queue.array[size-1] = element;
    }

    public Object element(ArrayQueueADT queue){
        if (queue.size!=0) return queue.array[0];
        else throw new IndexOutOfBoundsException();
    }

    public Object dequeue(ArrayQueueADT queue){
        Object buffer = queue.array[0];
        rewriteArray(queue,queue.size - 1, 1);
        queue.size--;
        return(buffer);
    }

    public int size(ArrayQueueADT queue) {return queue.size;}

    public void clear(ArrayQueueADT queue){queue.size = 0;}

    public boolean isEmpty(ArrayQueueADT queue){return (queue.size == 0);}
}
