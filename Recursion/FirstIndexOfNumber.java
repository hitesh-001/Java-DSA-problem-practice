import java.util.Scanner;

public class FirstIndexOfNumber {
    public static int firstIndexOfNumber(int input[],int key,int startIndex){
        if(startIndex==input.length){
            return -1;
        }
        if(input[startIndex]==key){
            return startIndex;
        }
        int res=firstIndexOfNumber(input, key,startIndex+1);
        return res;
    }
    public static int firstIndexOfNumber(int input[],int key){
        return firstIndexOfNumber(input, key,0);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int arr[]={7,4,9,11,-3};
        System.out.println("Enter key: ");
        int key=s.nextInt();
        int ans=firstIndexOfNumber(arr,key);
        System.out.println(ans);
    }
}
