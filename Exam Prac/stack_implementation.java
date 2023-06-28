import java.util.Stack;

public class stack_implementation {
    public static void main(String args[]){
        Stack<String> animals=new Stack<>();
        animals.push("Cow");
        animals.push("Dogs");
        animals.push("Tiger");
        animals.push("Lion");

        System.out.println("Stack : " + animals);

        animals.pop();
        System.out.println(animals.peek());
    }
}
