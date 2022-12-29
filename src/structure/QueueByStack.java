package structure;

import java.util.Stack;

/**
 * 双栈实现一个队列
 *
 * @param <E>
 */
public class QueueByStack<E> {

    private Stack<E> pushStack = new Stack<>();
    private Stack<E> popStack = new Stack<>();

    public void add(E value) {
        pushStack.push(value);
    }

    public E poll() {
        if (popStack.isEmpty() && pushStack.isEmpty()){
            throw new RuntimeException("队列是空的！");
        }
        if (popStack.isEmpty() && !pushStack.isEmpty()){
            shift();
        }
        return popStack.pop();
    }

    private void shift() {
        if (!popStack.isEmpty()) {
            return;
        }
        // 进行移动
        while (!pushStack.isEmpty()) {
            popStack.push(pushStack.pop());
        }
    }

    public static void main(String[] args) {

        QueueByStack<Integer> queue = new QueueByStack<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        queue.add(5);
        queue.add(6);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
