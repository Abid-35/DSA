public class QuickSort {
    
    // Function to perform QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition function (Lomuto partition scheme)
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choose the last element as pivot
        int i = low - 1;        // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and pivot (arr[high])
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return pivot index
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        
        System.out.println("Before sorting:");
        for (int num : arr)
            System.out.print(num + " ");
        
        quickSort(arr, 0, arr.length - 1);
        
        System.out.println("\nAfter sorting:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
