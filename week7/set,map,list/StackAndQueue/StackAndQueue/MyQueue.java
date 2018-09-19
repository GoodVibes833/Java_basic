package StackAndQueue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue implements Queue {
    private List<Object> objects;

    public MyQueue() {
        objects = new ArrayList<>();
    }
    @Override
    public void enqueue(Object obj) {
        objects.add(obj);
    }

    @Override
    public Object dequeue() {
        if (!isEmpty()) {
            return objects.remove(0);
        }
        return null;
    }

    @Override
    public Object peek() {
        if (!isEmpty()) {
            return objects.get(0);
        }
        return null;
    }

    @Override
    public int size() {
        return objects.size();
    }

    @Override
    public boolean isEmpty() {
        return objects.isEmpty();
    }
}
