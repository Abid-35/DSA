public class linear{
    public static void main(String[] args){
        System.out.println("Linear Search");
        int array[] = {1,3,5,7};
        int target = 5;
        int result = linearsearch(array,target);

        if(result != -1)
        System.out.println("The element is at index :" + result);
        else
        System.out.println("The element is not Found");

    }


        public static int linearsearch(int[] array , int target ){
            for(int i = 0 ; i<array.length ; i++){
                if(array[i]==target)
                 return i;
            }
            return -1;
        }
    }
