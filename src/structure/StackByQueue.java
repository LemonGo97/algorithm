package structure;

import java.util.ArrayDeque;
import java.util.EmptyStackException;
import java.util.Queue;

public class StackByQueue<E> {

    private Queue<E> queueA = new ArrayDeque<>();
    private Queue<E> queueB = new ArrayDeque<>();

    public void push(E value){
        queueA.add(value);
    }

    public E pop(){
        if (queueA.isEmpty() && queueB.isEmpty()){
            throw new EmptyStackException();
        }
        while (queueA.size() > 1) {
            queueB.add(queueA.poll());
        }
        E value = queueA.poll();
        while (!queueB.isEmpty()) {
            queueA.add(queueB.poll());
        }
        return value;
    }

    public static void main(String[] args) {
        StackByQueue<Integer> stack = new StackByQueue<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(6);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
