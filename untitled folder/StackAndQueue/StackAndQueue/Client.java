package StackAndQueue;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Client {

    public static void hello() {
        bye();
        System.out.println("Hello");
    }

    public static void bye() {
        System.out.println("Bye");
    }

    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
//        hello();
        stack.push("Giada");
        stack.push("Minami");
        stack.push("Bianca");

        System.out.println(stack.pop());

        MyQueue queue = new MyQueue();
        queue.enqueue("Giada");
        queue.enqueue("Minami");
        queue.enqueue("Bianca");

        System.out.println(queue.dequeue());


    }
}
