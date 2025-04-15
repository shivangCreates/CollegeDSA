class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularSinglyLinkedList {
    Node head;

    // Insert node at the end of the circular linked list
    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; // Point to itself (circular)
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Display the circular linked list
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("Circular Singly Linked List: ");
        while (true) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            if (temp == head) break; // Loop ends when we reach the head again
        }
        System.out.println("(back to head)");
    }

    // Find the middle value in the circular linked list
    void findMiddle() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node slow = head;
        Node fast = head;

        // Traverse the list with fast moving two steps at a time and slow moving one step
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle value is: " + slow.data);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        CircularSinglyLinkedList cll = new CircularSinglyLinkedList();

        // Insert some values at the end
        for (int val : new int[] { 10, 20, 30, 40, 50 }) {
            cll.insertEnd(val);
        }

        // Display the list
        cll.display();

        // Find and print the middle value
        cll.findMiddle();
    }
}
