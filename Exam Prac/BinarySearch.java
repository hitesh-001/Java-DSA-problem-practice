import java.util.*;
public class BinarySearch{
    public static int binarySearch(int arr[],int size,int key){
        int start=0;
        int end=size-1;
        int mid=(end+start)/2;
        while(start<=end){
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]>key){
                start=mid+1;
            }else{
                end=mid-1;
            }
            mid=(end+start)/2;
        }
        return -1;
    }
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int size=sc.nextInt();
        System.out.print("Enter key: ");
        int key=sc.nextInt();
        System.out.print("Enter Array: ");
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int result=binarySearch(arr,size,key);
        System.out.print(result);

    }
}