import java.util.Scanner;

public class SumOfArray {
    public static int sumOfArray(int input[]){
        if(input.length==0){
            return 0;
        }
        int smallarr[]=new int[input.length-1];
        for(int i=1;i<input.length;i++){
            smallarr[i-1]=input[i];
        }
        return input[0]+sumOfArray(smallarr);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int arr[]={7,4,9,11,-3};
        int sum=sumOfArray(arr);
        System.out.println(sum);
    }
}
