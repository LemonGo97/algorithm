package node;

/**
 * @author LemonGo97
 */
public class RemoveSingleLinkedNode {
    public static void main(String[] args) {

        SingleNode<String> head = new SingleNode<>("1", new SingleNode<>("1", new SingleNode<>("2", new SingleNode<>("1", new SingleNode<>("3", null)))));
        System.out.println(head);
        System.out.println(remove(head, "1"));
    }

    private static SingleNode<String> remove(SingleNode<String> head, String str) {
        while (head != null) {
            if (head.item.equals(str)) {
                head = head.next;
                continue;
            }
            break;
        }
        SingleNode<String> pre = head;
        SingleNode<String> cur = head;
        while (cur != null) {
            if (cur.item.equals(str)) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
