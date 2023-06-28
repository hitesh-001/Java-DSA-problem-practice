import java.util.Scanner;
public class Swap_Alternates {
    public static void swap(int arr[]){
        int i=0;
        while(i<arr.length-1){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i=i+2;
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            int n=s.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=s.nextInt();
            }
            for(int j=0;j<n;j++){
                System.out.print(arr[j]+" ");
            }System.out.println();
            swap(arr);
            for(int j=0;j<n;j++){
                System.out.print(arr[j]+" ");
            }
        }
    }
}
