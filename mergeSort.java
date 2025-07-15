public class mergeSort {

    public static void mergeSort(int array[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            Sortmerge(array, left, mid, right);
        }
    }

    public static void Sortmerge(int array[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int Larr[] = new int[n1];
        int Rarr[] = new int[n2];

        for (int x = 0; x < n1; x++) {
            Larr[x] = array[left + x];
        }
        for (int x = 0; x < n2; x++) {
            Rarr[x] = array[mid + 1 + x];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (Larr[i] < Rarr[j]) {
                array[k++] = Larr[i++];
            } else {
                array[k++] = Rarr[j++];
            }
        }

        while (i < n1) {
            array[k++] = Larr[i++];
        }

        while (j < n2) {
            array[k++] = Rarr[j++];
        }
    }

    public static void main(String[] args) {
        System.out.println("Trying the MergeSort");
        int arr[] = {3, 5, 1, 4, 6, 2};
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
