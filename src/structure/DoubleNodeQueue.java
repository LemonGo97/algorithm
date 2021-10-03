package structure;

import node.DoubleNode;

public class DoubleNodeQueue<T> {

    private DoubleNode<T> first = null;
    private DoubleNode<T> last = null;

    private int size = 0;

    public void enqueue(T item){
        DoubleNode<T> node = new DoubleNode<>(item, null, null);
        if (first == null){
            first = node;
            last = node;
        }else {
            node.prev = last;
            last = node;
        }
        size++;
    }

    public T dequeue(){
        if (first == null){
            throw new RuntimeException("队列中无任何元素！");
        }
        T item = first.item;
        first = first.next;
        return item;
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

}
