public class InsertionSort{
    public static  void main(String[] args){
        System.out.println("Trying the Insertion sort");
        System.out.println("Before Sorting");
        int arr[] = {55,2,44,11,53};
        for(int n :arr){
            System.out.print(n + " ");
        }
        System.out.println(" ");
        System.out.println("Starting the sorting");
        for(int i = 1 ; i<arr.length; i++){
            int  key = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j]>key){
                arr[j+1] =arr[j];
                j=j-1;
            }
            arr[j+1] = key;
            for(int n :arr){
            System.out.print(n + " ");
        }
        System.out.println(" ");
        }
        System.out.println("After swapping");
        for(int n : arr){
            System.out.print( n +" ");
        }
        System.out.println(" ");
    }

}