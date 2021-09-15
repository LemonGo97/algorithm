package node;

/**
 * @author LemonGo97
 */
public class RemoveDoubleLinkedNode {
    public static void main(String[] args) {
        DoubleNode<String> head = new DoubleNode<>("1", null, null);
        DoubleNode<String> node2 = new DoubleNode<>("1", head, null);
        DoubleNode<String> node3 = new DoubleNode<>("2", node2, null);
        DoubleNode<String> node4 = new DoubleNode<>("1", node3, null);
        DoubleNode<String> node5 = new DoubleNode<>("3", node4, null);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println(head);
        DoubleNode<String> reverse = remove(head,"1");
        System.out.println(reverse);
    }

    private static DoubleNode<String> remove(DoubleNode<String> head, String str){
        // 删除最前面为给定值的 node
        while (head != null) {
            if (head.item.equals(str)) {
                head = head.next;
                head.prev = null;
                continue;
            }
            break;
        }
        DoubleNode<String> pre = head;
        DoubleNode<String> cur = head;
        while (cur != null) {
            if (cur.item.equals(str)) {
                pre.next = cur.next;
                pre.next.prev = pre;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
