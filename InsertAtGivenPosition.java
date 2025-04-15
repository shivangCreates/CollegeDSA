
class Node1 {
    int data;
    Node next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList1 {
    Node head;

    LinkedList1() {
        head = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertAt(int ind, int val) {
        if (ind < 0) {
            System.out.println("Index can't be negative");
            return;
        }

        Node n = new Node(val);
        if (ind == 0) {
            insertAtBeginning(val);
            return;
        }

        Node temp = head;
        for (int i = 0; i < ind ; i++) {
            if (temp == null) {
                System.out.println("Index out of bounds");
                return; 
            }
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Index out of bounds");
            return; 
        }

        n.next = temp.next;
        temp.next = n;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class InsertAtGivenPosition {
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtBeginning(70);
        list.insertAtBeginning(30);
        list.insertAtBeginning(7000);
        list.printList(); 

        list.insertAt(0, 90); 
        list.printList(); 
    }
}
