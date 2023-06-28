import java.util.Scanner;

public class AllIndicesOfNumber {
    public static void allIndexOfNumber(int input[],int key,int startIndex){
        if(startIndex==input.length){
            System.out.println();
            return;
        }
        if(input[startIndex]==key){
            System.out.print(startIndex+ " ");
        }
        allIndexOfNumber(input, key,startIndex+1);
    }
    public static void allIndexOfNumber(int input[],int key){
        allIndexOfNumber(input, key,0);
        return;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int arr[]={9,4,9,4,9};
        System.out.println("Enter key: ");
        int key=s.nextInt();
        allIndexOfNumber(arr,key);
        
    }
}
