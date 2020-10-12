package ru.mirea.practice08;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{
    protected ConcurrentLinkedQueue<E> queue = new ConcurrentLinkedQueue<>();
    public WaitList() {}
    public WaitList(Collection<E> el) {
        queue.addAll(el);
    }

    @Override
    public void add(E element) {
        queue.add(element);
    }

    @Override
    public E remove() {
        return queue.poll();
    }

    @Override
    public boolean contains(E element) {
        return queue.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> el) {
        return queue.containsAll(el);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
