public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Welcome to the world");
        int arr[] = {4, 2, 5, 1, 10, 9};
        int minIndex = 0;

        System.out.println("Before Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("");
        System.out.println("Starting the Sorting..");

        for (int i = 0; i < arr.length-1; i++) {
            minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minIndex]>arr[j])
                  minIndex = j;  //By first iteration we will know that min index value is 1 at index 03 
            }
            int temp = arr[minIndex];
            arr[minIndex] =arr[i];
            arr[i] =temp;

             for (int num : arr) {
            System.out.print(num + " ");
        }  
        System.out.println(" "); 
        }
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
