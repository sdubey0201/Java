import java.util.Optional;
import java.util.stream.IntStream;

public class LinkedList {
    public Node createLinkedListFromArray(int[] values) {
        Node head = null;
        if (Optional.ofNullable(values).isPresent()) {
            for (int i = 0; i < values.length; i++) {
                if (i == 0) {
                    head = new Node(values[i]);
                } else {
                    Node tempHead = head;
                    while (tempHead.next != null) {
                        tempHead = tempHead.next;
                    }
                    tempHead.next = new Node(values[i]);
                }
            }
        }
        return head;

    }
    public void printLinkedList(Node head){
        while (head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
//        if (head ==null){
//            System.out.println("Empty list");
//            return;
//        }
//        do {
//
//        }while (head.next!=null);
    }
}
