class Node:
    def __init__(self, data):
        self.data = data
        self.prev = None
        self.next = None

class CircularDoublyLinkedList:
    def __init__(self):
        self.head = None

    def insert_end(self, data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
            new_node.next = new_node
            new_node.prev = new_node
            return
        tail = self.head.prev
        tail.next = new_node
        new_node.prev = tail
        new_node.next = self.head
        self.head.prev = new_node

    def display(self):
        if not self.head:
            print("List is empty.")
            return
        temp = self.head
        print("Circular Doubly Linked List:", end=" ")
        while True:
            print(temp.data, end=" <-> ")
            temp = temp.next
            if temp == self.head:
                break
        print("(back to head)")

    def find_middle(self):
        if not self.head:
            print("List is empty.")
            return None

        slow = self.head
        fast = self.head

        while fast.next != self.head and fast.next.next != self.head:
            slow = slow.next
            fast = fast.next.next

        print("Middle value is:", slow.data)
        return slow.data

# Example usage
cdll = CircularDoublyLinkedList()
for val in [10, 20, 30, 40, 50]:
    cdll.insert_end(val)

cdll.display()
cdll.find_middle()
