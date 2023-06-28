import java.util.Scanner;
public class Selection_sort{
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min_ind=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min_ind]>arr[j]){
                    min_ind=j;
                }
            }
            swap(arr,i,min_ind);
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
        selectionSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
}