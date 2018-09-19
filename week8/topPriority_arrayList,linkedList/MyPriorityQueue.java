package Chapter16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyPriorityQueue {
    private List<Student> list;

    public MyPriorityQueue() {
        this.list = new ArrayList<>();
    }

    // enqueue (offer)
    public void enqueue(Student newStudent) {
        this.list.add(newStudent);
    }

    // dequeueMin (poll)
    public Student dequeueMin() {
        if (list.isEmpty()) {
            System.out.println("The Queue is empty.");
            return null;
        }

        Student minStudent = list.get(0);
        int min = 0;
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(minStudent) < 0) {
                minStudent = list.get(i);
                min = i;
            }
        }
        return list.remove(min);
    }

    // peek()
    public Student peek() {
        if (list.isEmpty()) {
            System.out.println("The Queue is empty.");
            return null;
        }
        Student minStudent = list.get(0);
        int min = 0;
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(minStudent) < 0) {
                minStudent = list.get(i);
                min = i;
            }
        }
        return list.get(min);
    }

    // size()
    public int size() {
        return this.list.size();
    }

    // isEmpty()
    public boolean isEmpty() {
        return this.list.isEmpty();
    }
}
