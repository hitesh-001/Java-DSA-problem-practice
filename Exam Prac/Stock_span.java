public class Stock_span {
    public static void main(String args[]){
        int arr[]={30,35,40,38,35};
        int cnt=1;
        System.out.print(cnt+" ");

        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                cnt++;
                System.out.print(cnt+" ");
            }else{
                cnt=1;
                System.out.print(cnt+" ");
            }
        }
    }
}
