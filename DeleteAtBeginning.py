class Node:
    def _init_(self, data):
        self.data = data
        self.next = None

class DeleteAtBeginning:
    def _init_(self):
        self.head = None

    # Insert at the beginning
    def insert_at_beginning(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    # Delete the first node
    def delete_at_beginning(self):
        if self.head is None:
            print("List is empty, nothing to delete.")
            return
        self.head = self.head.next  # Move the head pointer to the next node

    # Print the list
    def print_list(self):
        current = self.head
        while current is not None:
            print(current.data, end=" ")
            current = current.next
        print()  # For new line after printing list

# Driver code
if __name__ == "_main_":
    list = DeleteAtBeginning()
    list.insert_at_beginning(10)
    list.insert_at_beginning(20)
    list.insert_at_beginning(30)
    
    print("Original list:")
    list.print_list()

    # Delete the node at the beginning
    list.delete_at_beginning()
    
    print("List after deleting at the beginning:")
    list.print_list()