class Node:
    def __init__(self, data):
        self.data = data
        self.prev = None
        self.next = None

class DoublyLinkedList:
    def __init__(self):
        self.head = None

    def insert_end(self, data):
        new_node = Node(data)
        if not self.head:  # If list is empty
            self.head = new_node
            return
        temp = self.head
        while temp.next:
            temp = temp.next
        temp.next = new_node
        new_node.prev = temp

    def delete_end(self):
        if not self.head:  
            print("List is empty. Nothing to delete.")
            return
        if not self.head.next:  
            print(f"Deleted node with value: {self.head.data}")
            self.head = None
            return
        temp = self.head
        while temp.next:
            temp = temp.next
        print(f"Deleted node with value: {temp.data}")
        temp.prev.next = None

    def display(self):
        temp = self.head
        if not temp:
            print("List is empty.")
            return
        print("Doubly Linked List:", end=" ")
        while temp:
            print(temp.data, end=" <-> " if temp.next else "\n")
            temp = temp.next

# Example usage
dll = DoublyLinkedList()
dll.insert_end(10)
dll.insert_end(20)
dll.insert_end(30)
dll.display()

dll.delete_end()
dll.display()

dll.delete_end()
dll.display()

dll.delete_end()
dll.display()

dll.delete_end()
