

public class binary{
    public static void main(String[] args){
        System.out.println("Binary Search");
        int num [] ={2,4,6,8,10};
        int target = 11;
        int result = binarySearch(num,target);
        if(result != -1){
            System.out.println("The element is found at :" + result);
        }
        else {
        System.out.println("The element is not found in the  array");
        }

        
    }
    public static int binarySearch(int num[],int target){
        // 1 , 3 , 5 , 7 , 9
        int left = 0;
        int right = num.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(num[mid] == target){
                return mid;

            }
            else if(num[mid]<target){
                left =mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;

    }

}    