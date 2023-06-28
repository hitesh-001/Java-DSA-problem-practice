public class balanced_brackett {

public static void Balance(String str){
    if(str.length()%2!=0){
        System.out.println("Not Balanced");
        return;
    }
    int r=0;
    int c=0;
    int s=0;
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='('){
            r++;
        }else if(str.charAt(i)==')'){
            r--;
        }else if(str.charAt(i)=='{'){
            c++;
        }else if(str.charAt(i)=='}'){
            c--;
        }else if(str.charAt(i)=='['){
            s++;
        }else if(str.charAt(i)==']'){
            s--;
        }
    }
    if(r==0 && c==0 && s==0){
        System.out.println("Balanced");
    }else{
        System.out.println("Not Balanced");
    }
}
 public static void main(String args[]){
    String st="(}){";
    Balance(st);
    
 }   
}
