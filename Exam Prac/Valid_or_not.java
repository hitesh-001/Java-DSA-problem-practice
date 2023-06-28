import java.util.*;
public class Valid_or_not {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int chk=0;
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            for(int j=0;j<n;j++){
                if(arr[j]==1){
                    chk++;
                }else{
                    chk--;
                }
                // System.out.println(chk);
                if(chk==-1){
                    System.out.println("Invalid");
                }
            }
            // System.out.println(chk);
            if(chk>=0){
                System.out.println("Valid");
            }
            
        }
    }
}
