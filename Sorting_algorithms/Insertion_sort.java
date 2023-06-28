import java.util.Scanner;

public class Insertion_sort {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter Array: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        insertionSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
}
