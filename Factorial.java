public class Factorial{
    public static void main(String[] args){
        System.out.println("Finding the Factorial");
        int result = Fact(5);
        System.out.println(result);
    }
    public static int Fact(int n){
        if(n!=0)
        return n*Fact(n-1);
        else
        return 1;
    }
}