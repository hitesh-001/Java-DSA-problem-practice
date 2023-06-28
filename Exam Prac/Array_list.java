import java.util.*;


public class Array_list{
    public static void main(String[] args){
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        list.add(1,50);
        System.out.println(list);

        List<Integer> newList=new ArrayList();
        newList.add(100);
        newList.add(200);

        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.get(1));

        list.remove(1);

        list.remove(Integer.valueOf(100));

        System.out.println(list);

        list.set(2,1000);
        System.out.println(list);

        System.out.println(list.contains(100));

        for(int i=0;i<list.size();i++){
            System.out.println("the element is " + list.get(i));
        }

        for(Integer ele:list){
            System.out.println("element is : " + ele);
        }

        Iterator<Integer> it= list.iterator();
        while(it.hasNext()){
            System.out.println("iterator" + it.next());
        }
        



    }
}