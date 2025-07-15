public class mergeSort{ 
       public static void mergeSort(int array[],int left , int right){
        if(left<right){
            int mid = (left+right)/2;
            mergeSort(array, left, mid);
            mergeSort(array, mid+1, right);
            Sortmerge(array, left , mid ,right);

        }
       }
        public static int Sortmerge(int array[], int left , int mid , int right){
            int n1 = mid-left+1;
            int n2 = right -mid;
            int Larr[] = new int[n1];
            int Rarr[] = new int[n2];
            for (int x = 0; x <n1;x++) {
                Larr[x] = array[left+x];
            }
          for (int x = 0; x <n1;x++) {
                Rarr[x] = array[mid+1+x];
            }

         int I , j , k = 0;
         while (I<n1 &&j<n2){
            if(Larr[i]<Rarr[j]){
                array[k]= Larr[i];
                i++;
            }
            else{
                 array[key] = Rarr[j];
                j++;
            }
            k++;
            }
            while (i < n1) {
            arr[k] = Larr[i];
        }
        while (j < n2) {
            arr[k++] = rArr[j++];
        }

         }
             
         }


           }
                
            }

            
        }
    
    public static void main (String[] args){
        System.out.println("Trying the MergeSort");
        int arr[] = {3,5,1,4,6,2};
        mergeSort(arr,0,arr.length-1);
    }
}