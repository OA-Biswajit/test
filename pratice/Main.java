public  class Main{
    public static  void display(Node head){


        while(head!=null){

            System.out.print(head.data+" ");
            System.out.println();
            System.out.println();
            head=head.next;

        }

    }
    public static class Node{


        Node next;
        int data;
        Node( int data){
            this.data=data;

        }
    }
    public static void main(String args[]){
        Node a=new Node(4);
        Node b=new Node(9);
        Node c=new Node(10);

        a.next=b;
        b.next = c;
        c.next = null;
        display(a);

    }



}