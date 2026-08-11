import java.util.LinkedList;

public class LINKED_LIST {
    public static void main(String[] args){
        LinkedList<Integer> List=new LinkedList<>();
        List.add(10);
        List.add(20);
        List.add(40);
        List.add(50);
        List.addFirst(5);
        List.addLast(55);
        List.add(3,30);
//        System.out.println(List.size());
        System.out.println(List);
//        System.out.println(List.get(3));
        System.out.println(List.remove());
        System.out.println(List.pop());
        List.add(60);
        List.pop();
        System.out.println(List);
        System.out.println(List.peek());
//        System.out.println(List.getFirst());
//        System.out.println(List.getLast());
//        System.out.println(List.reversed());
    }
}
