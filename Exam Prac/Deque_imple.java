import java.util.*;
public class Deque_imple {
    public static void main(String args[]){
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        adq.offer(10);
        adq.offerFirst(200);
        adq.offerLast(1);
        adq.offer(100);

        System.out.println(adq);

        System.out.println(adq.peekFirst());

        System.out.println(adq.peekLast());

        System.out.println(adq.pollLast());
    }
}
