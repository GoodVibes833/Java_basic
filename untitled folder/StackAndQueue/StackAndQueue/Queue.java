package StackAndQueue;

public interface Queue {

    void enqueue(Object obj);

    Object dequeue();

    Object peek();

    int size();

    boolean isEmpty();
}
