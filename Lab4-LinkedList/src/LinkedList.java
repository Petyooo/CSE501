public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        head = null;
    }
    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Object data) {
        // you don't need to worry about whether the list is empty or not
        // because you are just setting the newNode.next to point to head
        // head.next is the 2nd node!!
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public Object removeFirst() {
        if(!isEmpty()) {
            Object data = head.getData();
            head = head.getNext();
            return data;
        }
        return null;
    }



}
