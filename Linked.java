import java.util.LinkedList;

public class Linked{
    public static void main(String[] args){
        System.out.println("Trying the Linked List Methods ");
        LinkedList Num = new LinkedList();
        Num.add(5);
        Num.add(6);
        Num.addFirst(9);
        System.out.println(Num.get(1));
        System.out.println(Num);
        System.out.println(Num.peek());
    }
}
