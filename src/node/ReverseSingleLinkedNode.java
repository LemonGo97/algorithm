package node;

/**
 * @author lemongo97
 */
public class ReverseSingleLinkedNode {

    public static void main(String[] args) {
        SingleNode<String> head = new SingleNode<>("1", new SingleNode<>("2", new SingleNode<>("3", null)));
        show(head);
        show(reverse(head));
    }

    private static void show(SingleNode<String> head){
        System.out.println(head);
    }

    private static SingleNode<String> reverse(SingleNode<String> head){
        SingleNode<String> prev = null;
        SingleNode<String> next = null;
        while (head != null) {
            next = head.next;

            head.next = prev;
            prev = head;

            head = next;
        }
        return prev;
    }
}
