import java.util.LinkedList;
import java.util.Queue;
public class queue{
    public static void main(String[] args){
        System.out.println("Queue");
        Queue num = new LinkedList();
        num.offer(10);
        num.offer(20);// Offer methods is used for the adding the element 

        System.out.println(num);

        System.out.println(num.poll()); // poll method is used  for removing the element
        System.out.println(num);

        num.offer(40);
        num.offer(50);
        num.offer(60);
        System.out.println(num);
        System.out.println("The peek is " + num.peek());// It gives the first out element 

    }

}
