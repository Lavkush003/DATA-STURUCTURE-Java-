

public class LinkedList {

    //creating a node
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //head and tail
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){

        //step1=create new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        //step2 = create new node
        newNode.next=head; //link

        //step 3- head=newNode
        head=newNode;



    }
    
    //add last
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
     
     //print LinkedList
    public void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    // Insert a new Node in middle

    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;
        }

        //i=idx-1; temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
    
    //remove first elemnt from linkedlist
    public int removeFirst(){
        int val=head.data;
        head=head.next;
        return val;
    }

    //remove last
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;

        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev : i=size-2
        Node prev=head;
        for(int i=0; i<size-2; i++){
            prev=prev.next;
        }
        int val=prev.next.data; // tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

   public void reverse(){   // O(n)
    Node prev=null;
    Node curr= tail=head;
    Node next;

    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
   }

   //delete Nth node from end
   public void deleteNthfromEnd(int n){
    //calculate size
    int sz=0;
    Node temp=head;
    while(temp!=null){
        temp=temp.next;
        sz++;
    }
    if(n==sz){
        head=head.next; //removeFirst
        return;


    }
    //size-1
    int i=1;
    int iToFind=size-n;
    Node prev=head;
    while(i<iToFind){
        prev =prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return;
   }

   // finding mid of LinkedList
   //Slow-Fast approach
   public Node findMid(Node head){  //helper
   Node slow=head;
   Node fast=head;

   while(fast!=null && fast.next!=null){
    slow = slow.next; //+1
    fast=fast.next.next; //+2


   }
   return slow; //slow is my midNode

   }

   // Check whether a LinkedList is a palindrome or not

   public boolean checkPalindrome(){
    if(head==null || head.next==null){
        return true;
    }
    //step1-find mid
    Node midNode=findMid(head);

    //step-reverse 2nd half
    Node prev=null;
    Node curr=midNode;
    Node next;

    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    Node right=prev; //right half head
    Node left=head;

    //step3-Check left half & right half

    while(right!=null){
        if(left.data!=right.data){
            return false;
        }
        left=left.next;
        right=right.next;
    }
    return true;

   }

    //Detecting a LinkedList is a Cycle or not

    public static boolean isCycle(){  //Floyd's CycleFindingAlgorithm

        //slow-fast approach
        Node sl=head;
        Node ft=head;

        while(ft!=null && ft.next!=null){
            sl=sl.next; //+1
            ft=ft.next.next; //+2
            if(sl==ft){
                return true; //cycle exists
            }

        }
        return false; //cycle doesn't exist

    }


    public static void removeCycle(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!= null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //find meeting point
        slow=head;
        Node prev=null; //last node
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;

        }
        //remove cycle-> last.next=null
        prev.next=null;




    }

    // Merge Sort

    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;

        }
        return slow; //mid node
    }

    private Node merge(Node head1, Node head2){
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;

        while(head!=null && head2!=null){
            if(head1.data<= head2.data){
                temp.next=head1;
                head1=head.next;
                temp=temp.next;
            }else {
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;


        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;

        }
        return mergeLL.next;
    }

    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;

        }
        //find mid
        Node mid=getMid(head);
        //left & right mergeSort
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);

        //merge 
        return merge(newLeft, newRight);

        
       

    }
    public static void main(String args[]){
        LinkedList ll=new LinkedList();
       // ll.print();
        
        // //add first
        // ll.addFirst(2);
        // ll.print();
        // ll.addFirst(1);
        // ll.print();

        // //add Last
        // ll.addLast(3);
        // ll.print();
        // ll.addLast(4);
        // ll.print();

        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2,3);
        // ll.print();

        // //remove first
        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();
        //reverse a linkedList

        // ll.reverse();
        // ll.print();


        //deleting Nth node from last 



        // ll.deleteNthfromEnd(3);
        // ll.print();
        

        //check palindrome
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.print();
        // System.out.println(ll.checkPalindrome());

        // //Detecting a Cycle in linkedList
        // head=new Node(1);
        // head.next=new Node(2);
        // head.next.next=new Node(3);
        // head.next.next.next=head;
        // //1->2->3->1
        // System.out.println(isCycle());

        // //removeing cycle in linkedList
        // head =new Node(5);
        // Node temp=new Node(6);
        // head.next=temp;
        // head.next.next=new Node(7);
        // head.next.next.next=temp;
        // //5->6->7->5

        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        
        //mergeSort
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        //5->4->3->2->1

        ll.print();
        ll.head=ll.mergeSort(ll.head);
        ll.print();








    }
}