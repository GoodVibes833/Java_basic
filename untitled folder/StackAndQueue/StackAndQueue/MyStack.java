package StackAndQueue;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> implements Stack<T> {
    private List<T> objects;

    public MyStack() {
        this.objects = new ArrayList<>();
    }

    @Override
    public void push(T obj) {
        this.objects.add(obj);
    }

    @Override
    public T pop() {
        if (!isEmpty()) {
            return this.objects.remove(objects.size() - 1);
        }
        return null;
    }

    @Override
    public T peek() {
        if (!isEmpty()) {
            return this.objects.get(objects.size() - 1);
        }
        return null;
    }

    @Override
    public int size() {
        return this.objects.size();
    }

    @Override
    public boolean isEmpty() {
        return this.objects.isEmpty();
    }
}
