import java.util.Scanner;

public class CheckSorted {
    // public static boolean checkSorted(int input[]){
    //     if(input.length<=1){
    //         return true;
    //     }
    //     if(input[0]>input[1]){
    //         return false;
    //     }
    //     int smallans[]=new int[input.length-1];
    //     for(int i=1;i<input.length;i++){
    //         smallans[i-1]=input[i];
    //     }
    //     boolean ans= checkSorted(smallans);
    //     return ans;
    // }

    // Alternate--2

    public static boolean checkSortedBetter(int input[],int startindex){
        if(startindex>=input.length-1){
            return true;
        }
        if(input[startindex]>input[startindex+1]){
            return false;
        }
        boolean ans=checkSortedBetter(input, startindex+1);
        return ans;

    }
    // User only have to paas arr, startindex will handel by function overloading
    public static boolean checkSortedBetter(int input[]){
        return checkSortedBetter(input,0);
    }

    
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int arr[]={0,1,4,2,3};
        boolean res=checkSortedBetter(arr);
        System.out.println(res);
    }
}
