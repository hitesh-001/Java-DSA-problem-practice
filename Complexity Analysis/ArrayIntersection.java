import java.util.Scanner;
import java.util.Arrays;
public class ArrayIntersection{
    public static void arrayIntersection(int arr1[],int arr2[]){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                System.out.println(arr1[i]);
                i++;
                j++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else if(arr2[j]<arr1[i]){
                j++;
            }
        }

    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int arr1[]={6,2,6,2,1,9,8};
        int arr2[]={3,6,8,2,9};
        arrayIntersection(arr1,arr2);
    }
}