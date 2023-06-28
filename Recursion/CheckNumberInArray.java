import java.util.Scanner;

public class CheckNumberInArray {
    // public static boolean checkNumber(int input[],int key){
    //     if(input.length==0){
    //         return false;
    //     }
    //     if(input[0]==key){
    //         return true;
    //     }
    //     int smallans[]=new int[input.length-1];
    //     for(int i=1;i<input.length;i++){
    //         smallans[i-1]=input[i];
    //     }
    //     boolean result=checkNumber(smallans,key);
    //     return result;
    // }

    public static boolean checkNumber(int input[],int key,int startindex){
        if(startindex==input.length){
            return false;
        }
        if(key==input[startindex]){
            return true;
        }
        boolean ans=checkNumber(input, key, startindex+1);
        return ans;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int arr[]={7,4,9,11,-3};
        System.out.println("Enter key: ");
        int key=s.nextInt();
        boolean ans=checkNumber(arr,key,0);
        System.out.println(ans);
    }
}
