import java.util.Scanner;
public class Binary_Search {
    public static void binarySearch(int arr[],int k){
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        while(start<=end){
            if(arr[mid]==k){
                System.out.println("index: "+mid);
                return;
            }else if(arr[mid]>k){
                end=mid-1;
            }else if(arr[mid]<k){
                start=mid+1;
            }
            mid=(start+end)/2;
        }
        System.out.println("index: -1");
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter key : ");
        int key=s.nextInt();
        int arr[]={2,4,6,8,10,12,14,16,18};
        binarySearch(arr,key);

    }
}
