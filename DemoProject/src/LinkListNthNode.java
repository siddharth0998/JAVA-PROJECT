public class LinkListNthNode {

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

    public int getNode(int position) {
        Node tnode = head;
        int count = 0;
        while (tnode != null) {
            if (count == position) {
                return tnode.data;
            }
            count++;
            tnode = tnode.next;
        }
        assert (false);
        return 0;
    }

    public static void main(String[] args) {
        LinkListNthNode obj = new LinkListNthNode();
        obj.push(5);
        obj.push(4);
        obj.push(9);
        obj.push(2);
        obj.push(0);
        System.out.println(obj.getNode(10));
    }
}
