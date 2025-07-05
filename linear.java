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


        public static int linearsearch(int array[] , int target ){
            for(int i = 0 ; i<array.length ; i++){
                if(array[i]==target)
                 return i;
            }
            return -1;
        }
    }

//Time complexity -> measure of how the running time of the algorithm increases with the increase of the size of the input .
//     Big O	     Name	
//     O(1)	         Constant       //Good	
//     O(log n)	     Logarithmic	//Good
//     O(n)	         Linear	        //Ok

