package structure;

import java.util.Arrays;

public class ArrayStack<T> {

    private int size = 0;
    private Object[] items;
    private int p = -1;

    public ArrayStack(int length) {
        items = new Object[length];
    }

    public ArrayStack() {
        items = new Object[10];
    }

    public T peek(){
        if (this.p == -1 || this.isEmpty()) {
            throw new RuntimeException("栈空了！！");
        }
        return (T) this.items[this.p];
    }

    public void push(T item) {
        if (p == size - 1 && this.size == items.length) {
            expandCapacity();
        }
        this.items[p += 1] = item;
        this.size++;
    }

    public T pop() {
        if (this.p == -1 || this.isEmpty()) {
            throw new RuntimeException("栈空了！！");
        }
        this.p--;
        this.size--;
        return (T) this.items[this.p + 1];
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    private void expandCapacity() {
        this.items = Arrays.copyOf(this.items, this.items.length * 2);
    }
}
