public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Function to add elements to the list
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // Function to print the linked list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Static method to merge two sorted linked lists
    static Node mergeSortedLists(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;

        return dummy.next;
    }
}

public class MergeTwoLinkedlist {
    public static void main(String[] args) {  
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        // Add elements (assumed sorted) to list1 and list2
        list1.add(1);
        list1.add(3);
        list1.add(5);

        list2.add(2);
        list2.add(4);
        list2.add(6);

        System.out.print("List 1: ");
        list1.printList();
        System.out.print("List 2: ");
        list2.printList();

        LinkedList MergeTwoLinkedlist = new LinkedList();
        MergeTwoLinkedlist.head = LinkedList.mergeSortedLists(list1.head, list2.head);

        System.out.print("Merged List: ");
        MergeTwoLinkedlist.printList();
    }
}
