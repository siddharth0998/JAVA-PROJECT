public class LinkedList {

    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void pushFirst(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void pushAfter(Node prev_Node, int new_data) {

        if (prev_Node == null) {
            System.out.println("The given previous node can not be null");
            return;
        }

        Node new_Node = new Node(new_data);
        new_Node.next = prev_Node.next;
        prev_Node.next = new_Node;
    }

    public void pushLast(int new_data) {
        Node new_Node = new Node(new_data);

        if (head == null) {
            head = new_Node;
            return;
        }

        // new_Node.next = null;

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_Node;
        return;
    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    public void delete(int data) {
        Node temp = head, prev = null;

        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }

        if (temp.data == data && temp != head) {
            prev.next = temp.next;
        }

        if (temp == head && temp.data == data) {
            head = head.next;
        }

        if (temp == null) {
            return;
        }

    }

    public int getCount(Node node) {

        if (node == null) {
            return 0;
        }

        return 1 + getCount(node.next);
    }

    public int count() {
        return getCount(head);
    }

    public static void main(String[] args) {

        LinkedList list1 = new LinkedList();

        list1.pushLast(6);
        list1.pushFirst(5);
        list1.pushLast(10);
        list1.pushFirst(4);
        list1.pushAfter(list1.head.next, 15);
        list1.printList();
        System.out.println();
        list1.delete(5);
        list1.printList();
        System.out.println();
        System.out.println("count is: " + list1.count());

    }
}
