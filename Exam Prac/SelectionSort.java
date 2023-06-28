import java.util.*;
public class SelectionSort{
    public static void swap(int[] arr,int a,int b){
        int c=arr[a];
        arr[a]=arr[b];
        arr[b]=c;

    }
    public static void selectionSort(int arr[],int size){
        for(int i=0;i<size-1;i++){
            int minIndex=i;
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            swap(arr,i,minIndex);
        }
    }
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int size=sc.nextInt();
        System.out.print("Enter Array: ");
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        selectionSort(arr,size);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}