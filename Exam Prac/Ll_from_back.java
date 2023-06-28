import java.util.*;
public class Ll_from_back {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> ll=new LinkedList<>();
        int i=0;
        while(true){
            i=sc.nextInt();
            if(i==-1){
                break;
            }
            ll.add(i);
        }
        int key=sc.nextInt();
        int size=ll.size();
        System.out.println(ll.get(size-key));

    }
}
