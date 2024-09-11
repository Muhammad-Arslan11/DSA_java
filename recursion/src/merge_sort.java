import java.util.Arrays;

// merge sort using recursion
public class merge_sort {
    public static void main(String[] args) {
        int[] arr  = {2,7,4,8,9,10,3,1,0};
       mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    // merge function
    static void merge(int[] arr, int s, int e){
        // calculate mid
        int mid = s + (e-s) /2;

        // make two new arrays and copy values from main array
        int len1 = mid - s+1; // length: from 0th index to mid
        int len2 = e - mid; // length: from mid to end

        // make new arrays
        int[] first = new int[len1];
        int[] second = new int[len2];

        // here main array is split in two
        // copy values
      //  int mainArrayIndex = s;
        for(int i =0; i < len1; i++){
            first[i] = arr[s +i]; // from start to mid
        }

       // mainArrayIndex = mid+1;
        for(int i =0; i < len2; i++){
            second[i] = arr[mid+1 +i]; // from mid+1 to end
        }
        // merge 2 arrays

         int index1 = 0;
         int index2 = 0;
       int  mainArrayIndex = s;

         while(index1 < len1 && index2 < len2){
            if(first[index1] <= second[index2] ){
                arr[mainArrayIndex++] = first[index1++];
            }
            else{
                arr[mainArrayIndex++] = second[index2++];
            }

        }

         // may be any of the two array length is greater than the other
        // make sure that the leftover elements in any of the two array is placed back in the original array
        while(index1 < len1){
            arr[mainArrayIndex++] = first[index1++];
        }

        while(index2 < len2){
            arr[mainArrayIndex++] = second[index2++];
        }

    }




    static void mergeSort(int[] arr,int s, int e){
          // base condition
         if(s >= e){
             return;
         }
         // calculate mid
        int m = s + (e-s)/2;

         // recursive call for first half
         mergeSort(arr,s,m);
        // recursive call
        mergeSort(arr,m+1,e);

        // merge both arrays
        merge(arr,s,e);
    }
}
