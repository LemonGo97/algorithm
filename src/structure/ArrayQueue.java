package structure;

public class ArrayQueue<T> {

    private int size = 0;
    private Object[] items;
    private int ps = 0;
    private int pe = 0;

    public ArrayQueue() {
        this.items = new Object[10];
    }

    public ArrayQueue(int length) {
        this.items = new Object[length];
    }

    public void enqueue(T item) {
        if (this.size == this.items.length) {
            throw new RuntimeException("队列满了！！");
        }
        this.items[this.pe] = item;
        if (this.pe + 1 == this.items.length) {
            this.pe = 0;
        } else {
            this.pe++;
        }
        this.size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("队列空了！！");
        }
        T item = (T) this.items[this.ps];
        if (this.ps + 1 == this.items.length) {
            this.ps = 0;
        } else {
            this.ps++;
        }
        this.size--;
        return item;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }
}
