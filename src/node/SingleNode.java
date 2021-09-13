package node;

/**
 * @author lemongo97
 * 单链表
 */
public class SingleNode<E> {
    E item;
    SingleNode<E> next;

    SingleNode(E element, SingleNode<E> next) {
        this.item = element;
        this.next = next;
    }

    @Override
    public String toString() {
        return "SingleNode{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}
