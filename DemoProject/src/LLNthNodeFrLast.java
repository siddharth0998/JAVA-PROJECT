public class LLNthNodeFrLast {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // 5 6 1 9
    // 0 1 2 3
    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void getNodeFromLast(int position) {
        Node tnode = head;
        int length = 0;
        while (tnode != null) {
            tnode = tnode.next;
            length++;
        }
        if (position > length || position == 0) {
            return;
        }
        tnode = head;
        for (int i = 0; i <= length - position - 1; i++) {
            tnode = tnode.next;
        }
        System.out.println(tnode.data);

    }

    public static void main(String[] args) {
        LLNthNodeFrLast obj = new LLNthNodeFrLast();
        obj.push(5);
        obj.push(7);
        obj.push(2);
        obj.push(0);
        obj.push(9);
        obj.getNodeFromLast(3);
    }
}
