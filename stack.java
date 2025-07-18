import java.util.Stack;
public class stack{
    public static void main(String[] args) {

        Stack num = new Stack();
        num.push(30);
        System.out.println("We are doing the pop " + num.pop());
        num.push(40);
        num.push(50);
        num.push(60);
        System.out.println("Stack"+num);
        System.out.println("Peek gives last in element " + num.peek());
        System.out.println("Stack after all the operations " + num);

    }}
