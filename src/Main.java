// This is the MANUAL linkedList.
// Its enhance the DSA understanding and Used in coding Interviews

class Main {
    static class Node{
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }
    public static void main(String[] args) {

        Node N1 = new Node(10);
        Node N2 = new Node(20);
        Node N3 = new Node(30);
        Node N4 = new Node(40);
        Node N5 = new Node(50);
        Node N6 = new Node(60);

        N1.next=N2;
        N2.next=N3;
        N3.next=N4;
        N4.next=N5;
        N5.next=N6;

        Node head=N1;

        printList(head);
        head = addFirst(head, 5);
        printList(head);

        while(head != null){
            System.out.print(head.data+" -> ");
            head=head.next;
        }
        System.out.println("null");

        //using head to print the node in main method affect the result bz the header reference is removed when using this method
        while(head != null){
            System.out.print(head.data+" -> ");
            head=head.next;
        }
        System.out.println("null");

    }
    public static Node addFirst(Node head,int val){
        Node newNode = new Node(val);
        newNode.next=head;
        return newNode;
    }
    public static void printList(Node head){
        Node temp = head;    //Using temp or Using head not affect the result. Both are completely right
        while(head != null){
            System.out.print(head.data+" -> ");
            head=head.next;
        }
        System.out.println("null");
    }
}


//This is the Java's default LinkedList.Its easy and Used in the Projects and RealWorld.
//
//import java.util.LinkedList;
//class Main{
//    public static void main(String[] args ){
//        LinkedList<Integer> List=new LinkedList<>();
//        List.add(10);             //For add an element at end
//        List.add(20);
//        List.add(30);
//        List.add(40);
//        List.add(50);
//        System.out.print(List);
//
//        System.out.println();
//        List.addFirst(5);       //For add an element at first
//        System.out.print(List);
//
//        System.out.println();
//        List.add(3,25);//For add an element at middle
//        System.out.print(List);
//
//    }
//}

// Adding a new element at First/Last/Middle in the manual LinkedList
//
//class Main{
//    static class Node{
//        int data;
//        Node next;
//
//        Node(int val){
//            this.data=val;
//            this.next=null;
//        }
//    }
//    public static void main(String[] args){
//        Node N1=new Node(20);
//        Node N2=new Node(30);
//        Node N3=new Node(40);
//        Node N4=new Node(50);
//        Node N5=new Node(60);
//
//        N1.next=N2;
//        N2.next=N3;
//        N3.next=N4;
//        N4.next=N5;
//
//        Node head=N1;
//        Print(head);
//        System.out.println();
//
//        head=AddFirst(head,10);
//        head=AddLast(head,70);
//        head=AddLast(head,80);
//        head=AddMiddle(head,45,4);
//        Print(head);
//    }
//    public static Node AddLast(Node head,int val){
//        Node NewNode=new Node(val);
//        if(head==null){
//            return NewNode;
//        }
//        Node temp=head;
//        while(temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next=NewNode;
//        return head;
//    }
//    public static Node AddMiddle(Node head,int val,int index){
//
//        if(index==0){                       //if add at first
//            return AddFirst(head,val);
//        }
//
//        Node temp=head;
//
//        if(temp.next==null){                //if add at last
//            return AddLast(head,val);
//        }
//
//        for(int i=0;i<index-1;i++){         //travel to the index to the insert
//            if(temp==null){
//                return head;
//            }
//            temp=temp.next;
//        }
//
//        Node NewNode=new Node(val);         //insert at middle
//        NewNode.next=temp.next;
//        temp.next=NewNode;
//        return head;
//    }
//    public static Node AddFirst(Node head,int val){
//        Node NewNode = new Node(val);
//        if(head==null){
//            return NewNode;
//        }
//        NewNode.next=head;
//        return NewNode;
//    }
//    public static void Print(Node head){
//        Node temp=head;
//        while(temp!=null){
//            System.out.print(temp.data+" -> ");
//            temp=temp.next;
//        }
//        System.out.print("End");
//    }
//}

//Removing a Element at FIRST/LAST/MIDDLE in the manual LinkedList
//class Main{
//    static class Node{
//        int data;
//        Node next;
//
//        Node(int val){
//            this.data=val;
//            this.next=null;
//        }
//    }
//    public static void Print(Node head){
//        Node temp=head;
//        while(temp!=null){
//            System.out.print(temp.data+" -> ");
//            temp=temp.next;
//        }
//        System.out.print("End");
//        System.out.println();
//    }
//    public static Node RemoveFirst(Node head){
//        if(head==null){
//            return null;
//        }
//        head=head.next;
//        return head;
//    }
//    public static Node RemoveLast(Node head){
//        if(head==null){
//            return null;
//        }
//        if(head.next==null){
//            return null;
//        }
//        Node temp=head;
//        while (temp.next.next!=null){
//            temp=temp.next;
//        }
//        temp.next=null;
//        return head;
//    }
//    public  static Node RemoveMiddle(Node head,int index){
//        if(head==null){
//            return null;
//        }
//        if(index==0){
//            return RemoveFirst(head);
//        }
//        Node temp=head;
//        for(int i=0;i<index-1;i++){
//            if(temp.next==null){
//                System.out.println("Index Out of Bounds");
//                return head;
//            }
//            temp=temp.next;
//        }
//        if(temp.next==null){
//            System.out.println("Index Out of Bounds");
//            return head;
//        }
//        temp.next=temp.next.next;
//        return head;
//    }
//    public static void main(String[] args){
//        Node N1=new Node(10);
//        Node N2=new Node(20);
//        Node N3=new Node(30);
//        Node N4=new Node(40);
//        Node N5=new Node(50);
//
//        N1.next=N2;
//        N2.next=N3;
//        N3.next=N4;
//        N4.next=N5;
//
//        Node head=N1;
//        Print(head);
//        head=RemoveFirst(head);
//        Print(head);
//        head=RemoveLast(head);
//        Print(head);
//        head=RemoveMiddle(head,1);
//        Print(head);
//
//    }
//}

// Count the length of the Node
// Check the value if available send true else false
// Find the middle value
//
//class Main {
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int val) {
//            this.data = val;
//            this.next = null;
//        }
//    }
//    public static void main(String[] args) {
//        Node N1 = new Node(20);
//        Node N2 = new Node(30);
//        Node N3 = new Node(40);
//        Node N4 = new Node(50);
//        Node N5 = new Node(60);
//        Node N6 = new Node(70);
//        Node N7 = new Node(80);
//
//        N1.next = N2;
//        N2.next = N3;
//        N3.next = N4;
//        N4.next = N5;
//        N5.next = N6;
//        N6.next = N7;
//
//        Node head = N1;
//        System.out.println(Print(head));
//        if(Value(head,60)){
//            System.out.println("True");
//        }
//        else {
//            System.out.println("False");
//        }
//        int d=Mid(head);
//        System.out.println(d);
//    }
//    public static int Print(Node head){
//        int count=0;
//        while(head!=null){
//            count++;
//            head=head.next;
//        }
//        return count;
//    }
//    public static boolean Value(Node head,int k){
//        while(head!=null){
//            if(head.data==k){
//                return true;
//            }
//            head=head.next;
//        }
//        return false;
//    }
//    public static int Mid(Node head){
//        if(head==null){
//            return -1;
//        }
//        Node slow=head;
//        Node fast=head.next;
//
//        while(fast!=null && fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        return slow.data;
//    }
//}



