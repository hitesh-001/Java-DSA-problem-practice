import java.util.*;
public class Celebrity {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    break;
                }
                cnt++;
            }
            if(cnt==n){
                System.out.println(i);
            }
        }
        
    }
}
