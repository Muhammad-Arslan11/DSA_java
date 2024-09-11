import java.util.Arrays;

public class first_missing_positive {
    public static void main(String[] args) {
        int[] arr = {3,2,4,-1,1};
        cyclicSort(arr);
        System.out.println(num_finder(arr));
    }

    static void cyclicSort(int[] arr) {
        int index = 0;

        while (index < arr.length) {
            int correctIndex = arr[index] -1;
            // check whether the elem is at its correct index or not
            if (arr[index] > 0 && arr[index] <= arr.length && arr[index] != arr[correctIndex])  {
                // swap
                int temp = arr[index];
                arr[index] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                index++;
            }
        }

    }


    static int num_finder(int[] arr){
        // check whether the value == index of array
        for(int i=0; i< arr.length; i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return arr.length +1 ;
    }
}
