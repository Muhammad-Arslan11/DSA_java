import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {
        int[] arr  = {2,7,4,8,9,10,3,1,0};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int s, int e){
        // base condition
        if(s >= e){
            return;
        }

        //process
       int p = partition(arr, s, e);
        // recursive call
        quickSort(arr, s, p-1);

        // recursive call
        quickSort(arr, p+1, e);
    }

    static int partition(int[] arr, int s, int e){
        // take pivot
         int pivot = arr[s];

         // count the number of elements less than p
        // counter
        int count = 0;
         for(int i =s+1; i<=e; i++){ // start counting from one number after pivot: don't start from pivot
             if(arr[i] <= pivot){
                 count++;
             }
         }

          int rightPivotIndex = s+count;
         // swap pivot and place it at its right index of count
        swap(arr,s, rightPivotIndex);

        // run a loop with two pointers as i and j
        int i = s;
        int j = e;
        while(i < rightPivotIndex && j > rightPivotIndex){
            if(arr[i] <= pivot){
                i++;
            }
            else if (arr[j] >= pivot) {
                j--;
            }else{
                swap(arr,i,j);
                i++;
                j--;
            }
        }

   return rightPivotIndex;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
