/*
    This Node class should only be used by LinkedList and should not be seen or used
    by external entities.
    1. This means that we can declare all of the Node's internal variables with protected,
    since they will not need to be accessed directly outside the package.
    2. You should not have to create Node objects outside of the LinkedList when testing the code.
    3. You should never return a Node object from a public method in LinkedList.
 */

public class Node {
    protected Object data;
    protected Node next;

    protected Node(Object data) {
        this.data = data;
    }

    protected Object getData() {
        return this.data;
    }

    protected Node getNext() {
        return this.next;
    }

    protected void setData(Object data) {
        this.data = data;
    }

    protected void setNext(Node next) {
        this.next = next;
    }
}
