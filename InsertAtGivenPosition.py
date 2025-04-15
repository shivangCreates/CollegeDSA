class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def insert_at_beginning(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    def insert_at(self, index, value):
        if index < 0:
            print("Index can't be negative")
            return

        new_node = Node(value)
        if index == 0:
            self.insert_at_beginning(value)
            return

        temp = self.head
        for i in range(index):
            if temp is None:
                print("Index out of bounds")
                return
            temp = temp.next

        if temp is None:
            print("Index out of bounds")
            return

        new_node.next = temp.next
        temp.next = new_node

    def print_list(self):
        current = self.head
        while current is not None:
            print(current.data, end=" ")
            current = current.next
        print()  


if __name__ == "__main__":
    linked_list = LinkedList()

    linked_list.insert_at_beginning(10)
    linked_list.insert_at_beginning(20)
    linked_list.insert_at_beginning(30)
    linked_list.insert_at_beginning(70)
    linked_list.insert_at_beginning(30)
    linked_list.insert_at_beginning(7000)
    linked_list.print_list()  

    linked_list.insert_at(0, 90) 
    linked_list.print_list()  