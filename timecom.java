
public  class timecom{
    public static void main(String[] args){
        System.out.println("Big O notation");
        int array[] ={2,4,6,8,10};
        int target = 10;
        int result = linearsearch(array,target);
        if(result!= -1)
        {
            System.out.println("element is founded at index:" +result);
        }
        else{
            System.out.println("element is not founded");
        } 

        int result1 = Binarysearch(array, target);
        if(result1 != -1)
        {
            System.out.println("element is founded at index:" +result1);
        }
        else{
            System.out.println("element is not founded");
        }
    }

    public static int linearsearch(int array[] , int target){
        int steps =0;
        for(int i = 0 ; i<array.length;i++){
            steps++;
            if(array[i]==target){
            System.out.println("The no.of the Steps are :" +steps);
            return i;
            }
        }
        System.out.println("The no.of the Steps are :" +steps);
        return -1;
    }
    public static int Binarysearch(int array[], int target){
        int left =0;
        int right=array.length-1;
        int mid;
        int Steps =0;
        while(left<=right){
            Steps++;
            mid = (left+right)/2;
            if(array[mid]==target){
                System.out.println("The no.of the Steps are :" +Steps);
                return mid;
            }
            else if(array[mid]<target){
                left=mid+1;

            }
            else{
                right = mid-1;
            }
        }
        System.out.println("The no.of the Steps are :" +Steps);
        return -1;

    }

}