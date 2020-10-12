package ru.mirea.practice08;

class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;
    private int i = 0;
    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if (i == capacity) {
            System.out.println("Очередь заполнена!");
        }
        else {
            super.add(element);
            i++;
        }
    }
}
