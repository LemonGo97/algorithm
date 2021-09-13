package node;

/**
 * @author lemongo97
 * 双向链表
 */
public class DoubleNode<E> {
    E item;
    DoubleNode<E> prev;
    DoubleNode<E> next;

    DoubleNode(E element, DoubleNode<E> prev, DoubleNode<E> next) {
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
