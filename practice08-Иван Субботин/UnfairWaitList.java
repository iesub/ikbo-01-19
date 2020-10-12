package ru.mirea.practice08;

class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {}
    public void remove(E element) {
        queue.remove(element);
    }
    public void moveToBack(E element) {
        queue.remove(element);
        queue.add(element);
    }

    public String toString() {
        return "WaitList{" +
                "queue=" + queue +
                '}';
    }
}
