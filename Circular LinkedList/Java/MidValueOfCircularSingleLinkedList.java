class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedList{
    Node head;
    LinkedList(){
        head=null;
    }

    public void insertAtEnd(int data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
            head.next=head;
            return;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=new_node;
        new_node.next=head;
    }

    public void print_list(){
        if(head==null)
        {
            System.out.println("null");
            return;
        }
        Node temp=head;
        System.out.print("[");
        while(true) { 
            System.out.print(temp.data);
            temp=temp.next;
            if(temp==head)
            {
                System.out.println("]");
                break;
            }
            else{
                System.out.print(", ");
            }
        }
    }

    public void find_mid(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node slow=head;
        Node fast=head;
        while(fast.next!=head && fast.next.next!=head){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("mid "+slow.data);
    }
}

public class MidValueOfCircularSingleLinkedList{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        for(int i=1;i<6;i++)
        {
            list.insertAtEnd(i);
        }
        list.print_list();

        list.find_mid();
    }
}
