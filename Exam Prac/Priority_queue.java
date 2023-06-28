import java.util.*;

public class Priority_queue{
    public static void main(String args[]){
        Queue<Integer> pq=new PriorityQueue<>();
        pq.offer(100);
        pq.offer(20);
        pq.offer(30);
        pq.offer(40);

        System.out.println(pq);

        pq.poll();

        System.out.println(pq);

        System.out.println(pq.peek());

    }
}