
import java.util.*;
public class Remove_dupli {
    public static void main(String args[]){
        int arr[]={5,1,2,6,4,4,5};
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        for(Integer ele: hs){
            System.out.print(ele + " ");
        }
    }    
}
