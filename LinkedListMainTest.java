public class LinkedListMainTest {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Node head = linkedList.createLinkedListFromArray(new int[]{1,2,3});
       linkedList.printLinkedList(head);
       Node revers = linkedList.revers(head);
       linkedList.printLinkedList(revers);
    }
}