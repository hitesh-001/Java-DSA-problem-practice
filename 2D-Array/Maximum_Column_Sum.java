import java.util.Scanner;
public class Maximum_Column_Sum{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int max=0;
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<3;j++){
                sum=sum+arr[j][i];
            }
            if(max<sum){
                max=sum;
            }
        }
        System.out.println(max);
    }
}