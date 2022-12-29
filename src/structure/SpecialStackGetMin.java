package structure;

import java.util.Stack;

/**
 * 实现一个特殊的栈，在基本功能的基础上，再实现返回栈中最小元素的功能
 *
 * 1）pop、push、getMin操作的时间复杂度都是 O(1)。
 * 2）设计的栈类型可以使用现成的栈结构。
 */
public class SpecialStackGetMin {

    private Stack<Integer> stackA = new Stack<>();
    private Stack<Integer> stackB = new Stack<>();

    public void push(Integer value) {
        stackA.push(value);
        if (stackB.isEmpty()) {
            stackB.push(value);
        }
        stackB.push(stackB.peek() > value ? value : stackB.peek());
    }

    public Integer pop() {
        stackB.pop();
        return stackA.pop();
    }

    public Integer getMin() {
        return stackB.peek();
    }

    public static void main(String[] args) {
        SpecialStackGetMin stack = new SpecialStackGetMin();
        stack.push(1);
        stack.push(0);
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(0);
        System.out.println(stack.getMin());
        stack.pop();
        stack.pop();
        System.out.println(stack.getMin());
        stack.pop();
        stack.pop();
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
    }
}
