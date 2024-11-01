class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    
    public Node returnMiddle() {
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        
        while (fast != null && fast.next != null) {
            slow = slow.next;      
            fast = fast.next.next;  
        }

        return slow;
    }

    
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
}