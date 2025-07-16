import java.util.LinkedList;

public class Linked{
    public static void main(String[] args){
        System.out.println("Trying the Linked List Methods ");
        LinkedList Num = new LinkedList();
        Num.add(5);//add method is used add the elemnts in linked list
        Num.add(6);
        Num.addFirst(9);//addfirst is used to add element at first 
        System.out.println(Num.get(1));//used to access the element 
        System.out.println(Num);
        System.out.println(Num.peek());//to access the head element
    }
}
// Linked list Data structure is abstract  data structure  it doesnt work with index values when if u try to access with index value  it will track btw the elmments.


