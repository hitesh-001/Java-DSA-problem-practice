public class PrintKeypad {
    public static String getString(int i){
        if(i==2){
            return "abc";
        }
        if(i==3){
            return "def";
        }
        if(i==4){
            return "ghi";
        }
        if(i==5){
            return "jkl";
        }
        if(i==6){
            return "mno";
        }
        if(i==7){
            return "pqrs";
        }
        if(i==8){
            return "tuv";
        }
        if(i==9){
            return "wxyz";
        }
        return "";
    }
    public static void printKeypad(int input,String outputSoFar){
        if(input==0){
            System.out.println(outputSoFar);
            return;
        }
        int lastDigit=input%10;
        String value=getString(lastDigit);
        // if(value.length()==3){
        //     printKeypad(input/10,value.charAt(0)+outputSoFar);
        //     printKeypad(input/10,value.charAt(1)+outputSoFar);
        //     printKeypad(input/10,value.charAt(2)+outputSoFar);
        // }else if(value.length()==4){
        //     printKeypad(input/10,value.charAt(0)+outputSoFar);
        //     printKeypad(input/10,value.charAt(1)+outputSoFar);
        //     printKeypad(input/10,value.charAt(2)+outputSoFar);
        //     printKeypad(input/10,value.charAt(3)+outputSoFar);

        // }
        for(int i=0;i<value.length();i++){
            printKeypad(input/10,value.charAt(i)+outputSoFar);
        }
        
    }
    public static void printKeypad(int num){
        printKeypad(num,"");
    }
    public static void main(String args[]){
        printKeypad(23);
    }
}
