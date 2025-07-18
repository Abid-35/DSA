import java.util.TreeSet;

public class BST {
    public static void main(String[] args) {
        TreeSet<Integer> bst = new TreeSet<>();

        int[] values = {8, 7, 12, 15, 2, 5};
        for (int val : values) {
            bst.add(val);
        }
        System.out.println(bst);
    }
}
