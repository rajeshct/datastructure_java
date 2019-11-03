import java.util.*;
public class ReverseListFromGivenNode {
    
    public static void main(String args[]) {
        Node head=new Node(1,new Node());
        createList(head);
        reverseListFromPosition(head,getElementAt(head,3));
        printList(head);
    }
    
    
    private static void reverseListFromPosition(Node head,Node reverseElement){
        Node temp=head;
        Node lastNode=null;
        
        while(temp!=null){
            if(temp.next==reverseElement){
                lastNode= temp;
                break;
            }
            temp=temp.next;
        }
        
        Node current =reverseElement;
        Node previous=null;
        Node next=null;
        
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        
        lastNode.next=previous;
    }

    

    private static void createList(Node head){
        Node current=head.next;
        for(int i=2;i<20;i++){
            current.value=i;
            current.next =new Node();
            current = current.next;
        }
        current.value=20;
    }
    
     private static Node getElementAt(Node head, int index){
        for(int i=0;i<index;i++){
            head=head.next;
        }
        return head;
    }
    
    private static void printList(Node head){
        Node temp =head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
}


class Node{
        public int value;
        public Node next;
        
        public Node(){ }
        
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }

