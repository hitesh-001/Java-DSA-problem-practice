public class Delete_ele {
    public static void main(String args[]){
        int arr[]={3,8,2,7,1};
        int key=8;
        int ind=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                ind=i;
                break;
            }
        }

        for(int i=ind;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
