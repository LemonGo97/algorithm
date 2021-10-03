package node;

/**
 * @author lemongo97
 * 双向链表
 */
public class DoubleNode<E> {
    public E item;
    public DoubleNode<E> prev;
    public DoubleNode<E> next;

    public DoubleNode(E element, DoubleNode<E> prev, DoubleNode<E> next) {
        this.item = element;
        this.prev = prev;
        this.next = next;
    }

    @Override
    public String toString() {
        return "DoubleNode{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}
