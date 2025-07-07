public class bubble{
    public static void main(String[] args){
        System.out.println("Hello world ");
        int arr[] = {2,5,1,10,8,6};
        int temp = 0;
        System.out.println("Before Sorting");
        for(int num : arr){
            System.out.print(num);
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.println("Starting the Sorting");

        for(int i = 0 ; i<arr.length;i++){
            for(int j = 0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;

                }
            }
            for(int num :arr){
            System.out.print(num);
            System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println("Sorting is Done");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}