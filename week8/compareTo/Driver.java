package Chapter16;

import java.util.PriorityQueue;

public class Driver {
    public static void main(String[] args) {
        Student s1 = new Student("Giada", 100);
        Student s2 = new Student("Yukako", 120);
        Student s3 = new Student("Javier", 112);
        Student s4 = new Student("Alex", 121);
        Student s5 = new Student("Kenta", 60);
        Student s6 = new Student("Rei", 61);
        Student s7 = new Student("Charles", 70);
        Student s8 = new Student("Natsumi", 200);

        MyPriorityQueue students = new MyPriorityQueue();

        students.enqueue(s1);
        students.enqueue(s2);
        students.enqueue(s3);
        students.enqueue(s4);
        students.enqueue(s5);
        students.enqueue(s6);
        students.enqueue(s7);
        students.enqueue(s8);

        System.out.println("Size: " + students.size());
        System.out.println("Min: " + students.dequeueMin());

        System.out.println("Size: " + students.size());
        System.out.println("Min: " + students.dequeueMin());

        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.offer(s1);
        pq.peek();
        pq.poll();
        pq.size();
        pq.isEmpty();
        pq.clear();

    }
}
