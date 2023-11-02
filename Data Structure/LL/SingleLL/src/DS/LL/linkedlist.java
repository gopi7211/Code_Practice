package DS.LL;



public class linkedlist {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int val){
            data = val;
            next = null;
        }
    }

    linkedlist(){
        head = null;
    }


   public void InsertAtBegining(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }
        else{
           newNode.next = head;
           head = newNode;
        }
    }


    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void insertAtPos(int pos,int val){
        if(pos == 0){
            InsertAtBegining(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for(int i=1;i<pos;i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Invalid Position");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

}
