import java.util.Scanner;
public class Linear_Search {
    public static void linearSearch(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                System.out.println("Position: "+(i+1));
                return;
            }
        }
        System.out.println("-1");
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter key : ");
        int key=s.nextInt();
        int arr[]={1,2,3,4,5,6,7,78,9,10};
        linearSearch(arr,key);
    }
}
