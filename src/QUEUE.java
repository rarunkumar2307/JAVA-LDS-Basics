import java.util.ArrayDeque;
import java.util.Queue;

public class QUEUE {
    public static void  main(String[] args){
        Queue<Integer> queue =new ArrayDeque<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        queue.add(60);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue.remove());

        boolean r= (queue.isEmpty());

        System.out.println(r);

        System.out.println(queue);
    }
}
