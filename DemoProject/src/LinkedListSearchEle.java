class LinkedListSearchEle {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public boolean search(Node head, int data) {
        if (head == null)
            return false;

        if (head.data == data)
            return true;

        return search(head.next, data);
    }

    public static void main(String[] args) {
        LinkedListSearchEle obj = new LinkedListSearchEle();
        obj.push(5);
        obj.push(6);
        obj.push(1);
        obj.push(8);
        obj.push(3);
        System.out.println(obj.search(obj.head, 7));
        System.out.println(obj.search(obj.head, 5));
    }
}