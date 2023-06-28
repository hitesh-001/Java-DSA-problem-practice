
public class Largest_row_column {
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int max_col=0;
        int ind1=0;
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<3;j++){
                sum=sum+arr[j][i];
            }
            if(max_col<sum){
                max_col=sum;
                ind1=i;
            }
        }
        int ind2=0;
        int max_row=0;
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<3;j++){
                sum=sum+arr[i][j];
            }
            if(max_row<sum){
                max_row=sum;
                ind2=i;
            }
        }
        if(max_row>max_col){
            System.out.println("row " + ind2 +" " +  max_row);
        }else{
            System.out.println("column " + ind1 +" " +  max_col);
        }
    }
}
