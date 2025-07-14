public class QuickSort{
    public  static void main(String[] args){
        System.out.println("TRying the QuickSort");
        int num[] = {22,55,12,32};
        System.out.println("Before Sorting");
        for(int n : num){
            System.out.print(n + " ");
        }
        System.out.println(" ");

        QuickSort( num,0,num.length-1);

        System.out.println("After Sorting");

        for(int n : num){
            System.out.print(n + " ");
        }
        System.out.println(" ");


        }

        public static void QuickSort(int array[] , int  low , int high){
            if(low<high){
            int  pi = partition(array, low, high);
            QuickSort(array, low, pi-1);
            QuickSort(array, pi+1, high);
            }
        }
     public static int partition(int []array1,  int low , int high){
        int pivot = array1[high];
        int i = low-1;
        for(int j = low ; j<high ; j++){
            if(array1[j]<pivot){
                i++;
                int temp = array1[i];
                array1[i] = array1[j];
                array1[j] = temp;
            }
        }
    
        int temp = array1[i+1];
        array1[i+1] = array1[high];
        array1[high] = temp;
        return i+1;
     }
} 

     
