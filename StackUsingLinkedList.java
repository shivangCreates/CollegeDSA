class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    // Push at top (normal stack push)
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Insert at bottom of the stack (beginning of linked list)
    public void pushAtBottom(int data) {
        Node newNode = new Node(data);

        if (top == null) {
            top = newNode;
            return;
        }

        Node temp = top;
        // Traverse to the last node
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Pop from top
    public int pop() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    // Display stack elements
    public void display() {
        Node temp = top;
        System.out.print("Stack (Top to Bottom): ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();  // Output: 30 20 10

        stack.pushAtBottom(5);  // Insert at the beginning (bottom of stack)

        stack.display();  // Output: 30 20 10 5
    }
}