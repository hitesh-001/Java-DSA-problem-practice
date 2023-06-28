import java.util.*;
public class Frequency {
    public static void main(String args[]){
        int arr[]={1,2,3,1,2,3,1,2,3};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int cnt=0;
            if(!hs.contains(arr[i])){
                for(int j=0;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        cnt++;
                    }
                }
                hs.add(arr[i]);
                System.out.println(arr[i]+": "+ cnt);
            }
        }
    }
}
