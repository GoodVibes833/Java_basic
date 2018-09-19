package StackAndQueue;

public interface Stack<T>{

    void push(T obj);

    T pop();

    T peek();

    int size();

    boolean isEmpty();
}
