

public class binary{
    static  int steps =0;
    public static void main(String[] args){
        System.out.println("Binary Search");
        int num [] ={2,4,6,8,10};
        int target = 10;
        int result = binarySearch(num,target,0,num.length-1);
        if(result != -1){
            System.out.println("The element is found at :" + result);
        }
        else {
        System.out.println("The element is not found in the  array");
        }

        
    }
    public static int binarySearch(int num[],int target,int left , int right){
        // 1 , 3 , 5 , 7 , 9
        // int left = 0;
        // int right = num.length-1;
        
        if(left<=right){
            int mid = (left+right)/2;
            steps++;
            if(num[mid] == target){
                System.out.println("The no . of Steps are : " +steps);
                return mid;
            }
            else if(num[mid]<target)
               return binarySearch(num, target, mid+1, right);
            
            else
               return  binarySearch(num, target, left, mid-1);
            
        }
        System.out.println("The no.of steps are : "+steps);
        return -1;

    }

}    