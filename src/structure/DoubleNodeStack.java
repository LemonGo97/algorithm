package structure;

import node.DoubleNode;

/**
 * @author lemongo97
 */
public class DoubleNodeStack<T> {

    private int size = 0;
    private DoubleNode<T> last = null;

    public T peek() {
        if (this.last == null) {
            throw new RuntimeException("栈空了！");
        }
        return last.item;
    }

    public void push(T item) {
        DoubleNode<T> last = new DoubleNode<>(item, this.last, null);
        if (this.last != null) {
            this.last.next = last;
        }
        this.last = last;
        this.size++;
    }

    public T pop() {
        if (this.last == null) {
            throw new RuntimeException("栈空了！");
        }
        this.size--;
        DoubleNode<T> itemNode = this.last;
        this.last = this.last.prev;
        if (this.last!=null){
            this.last.next = null;

        }
        return itemNode.item;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }
}
