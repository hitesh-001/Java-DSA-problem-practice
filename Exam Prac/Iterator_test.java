import java.util.*;
public class Iterator_test {
    public static void main(String args[]){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        ArrayList<Integer> al2=new ArrayList<>();
        al2.add(1);
        al2.add(2);
        al2.add(0);
        al2.add(7);
        al.retainAll(al2);
        System.out.println(al);
        // Iterator itr=al.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }
        // for(int i=0;i<al.size();i++){
        //     System.out.println(al.get(i));
        // }
        // ListIterator<Integer> li=al.listIterator(al.size());
        // while(li.hasPrevious()){
        //     System.out.println(li.previous());
        // }
        

    }
}
