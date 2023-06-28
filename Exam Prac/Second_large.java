
public class Second_large {
    public static void main(String args[]){
        int arr[]={-1,7,1,34,18};
        int max=arr[0];
        int max2=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
        for(int i=0;i<arr.length;i++){
            if(max2>arr[i] && max2<max){
                max2=arr[i];
            }
        }
        System.out.println("Second Largest: "+max2);
    }   
}
