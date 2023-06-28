import java.util.Scanner;

public class LastIndexOfNumber {
    public static int lastIndexOfNumber(int input[],int key,int lastIndex){
        if(lastIndex<0){
            return -1;
        }
        if(input[lastIndex]==key){
            return lastIndex;
        }
        int res=lastIndexOfNumber(input, key,lastIndex-1);
        return res;
    }
    public static int lastIndexOfNumber(int input[],int key){
        return lastIndexOfNumber(input, key,input.length-1);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int arr[]={7,4,9,11,-3};
        System.out.println("Enter key: ");
        int key=s.nextInt();
        int ans=lastIndexOfNumber(arr,key);
        System.out.println(ans);
    }
}
