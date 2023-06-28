public class Segregate0_1 {
    public static void main(String a[]){
        int arr[]={0,1,0,1,0,0,1};
        int cnt0=0;
        int cnt1=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==0){
                cnt0++;
            }else{
                cnt1++;
            }
        }
        
        for(int i=0;i<cnt0;i++){
            arr[i]=0;
        }
        for(int i=cnt0;i<cnt1+cnt0;i++){
            arr[i]=1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
