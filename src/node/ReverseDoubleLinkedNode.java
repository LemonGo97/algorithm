package node;

/**
 * @author lemongo97
 * 双链表反转
 */
public class ReverseDoubleLinkedNode {
    public static void main(String[] args) {

        DoubleNode<String> head = new DoubleNode<>("1", null, null);
        DoubleNode<String> node2 = new DoubleNode<>("2", head, null);
        head.next = node2;
        node2.next = new DoubleNode<>("3", node2, null);
        System.out.println(head);
        DoubleNode<String> reverse = reverse(head);
        System.out.println(reverse);
    }


    /**
     * 双向链表反转
     * @param head
     * @return
     */
    private static DoubleNode<String> reverse(DoubleNode<String> head){
        DoubleNode<String> prev = null;
        DoubleNode<String> next = null;

        while (head != null) {
            // 先把下一个节点值存起来
            next = head.next;

            // 把当前节点的下一个节点指针 指到当前节点上
            head.next = prev;
            head.prev = next;

            prev = head;
            head = next;
        }
        return prev;
    }
}
