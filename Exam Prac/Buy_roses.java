import java.util.*;
public class Buy_roses {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=1;
        for(int i=0;i<t;i++){
            // int n=sc.nextInt();
            int arr[]={10,2,6,8,4};
            Arrays.sort(arr);
            int money=10;
            int temp1=0;
            int temp2=0;
            int diff=1000;
            for(int j=0;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[j]+arr[k]==money){
                        if(diff>arr[k]-arr[j]){
                            temp1=arr[j];
                            temp2=arr[k];
                            diff=arr[k]-arr[j];
                        } 
                        System.out.println(diff);   
                    }
                }    
            }
            System.out.println(temp1+" "+temp2);
        }
    }
}
