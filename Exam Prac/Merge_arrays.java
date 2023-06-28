import java.util.*;
public class Merge_arrays {
    public static void main(String args[]){
        int arr1[]={1,5,6,7};
        int arr2[]={2,5,8,9,11};
        int arr3[]=new int[arr1.length + arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        int i=arr1.length;
        int j=0;
        while(i < arr1.length + arr2.length){
            arr3[i]=arr2[j];
            i++;
            j++;
        }
        Arrays.sort(arr3);
        for(i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }

    }

}
