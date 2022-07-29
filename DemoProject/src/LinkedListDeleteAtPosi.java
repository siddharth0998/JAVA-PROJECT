// 8->5->4->6->9->10
// 0  1  2  3  4  5

public class LinkedListDeleteAtPosi {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void push(int new_data) {

        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void delete(int position) {
        if (head == null)
            return;

        if (position == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        Node data = temp.next.next;
        temp.next = data;
        if (temp == null) {
            return;
        }
    }

    public void print() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data);
            if (tnode.next != null) {
                System.out.print("->");
            }
            tnode = tnode.next;
        }
        System.out.println();
    }

    public int getCount(Node node) {
        if (node == null)
            return 0;
        return 1 + getCount(node.next);
    }

    public int count() {
        return getCount(head);
    }

    public static void main(String[] args) {
        LinkedListDeleteAtPosi obj = new LinkedListDeleteAtPosi();
        obj.push(10);
        obj.push(9);
        obj.push(6);
        obj.push(4);
        obj.push(5);
        obj.push(8);
        obj.print();
        System.out.println("length of linked list is: " + obj.count());
        obj.delete(0);
        obj.print();
        System.out.println("length of linked list is: " + obj.count());
    }
}