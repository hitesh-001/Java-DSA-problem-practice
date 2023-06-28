public class Circular_Array {
    public static void main(String args[]){
        int arr[]={1,2,3};
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                if(arr[i]<arr[0]){
                    System.out.println(arr[0]);
                }else{
                    System.out.println(-1);
                }
            }else{

                if(arr[i]<arr[i+1]){
                    System.out.print(arr[i+1]+" ");
                }
                else{
                    System.out.println(-1);
                }
            }
            
        }
    }
}
