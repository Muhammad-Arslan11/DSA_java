import java.util.Arrays;

public class duplicate_and_missing {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(num_finder(arr)));
    }

    static void cyclicSort(int[] arr) {
        int index = 0;


        while (index < arr.length) {
            int correctIndex = arr[index] -1;
            // check whether the elem is at its correct index or not
            if (arr[index] != arr[correctIndex])  {
                // swap
                int temp = arr[index];
                arr[index] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                index++;
            }
        }

    }

    static int[] num_finder(int[] arr){
        // check whether the value == index of array
        for(int i=0; i< arr.length; i++){
            if(arr[i] != i+1){
                return new int[] {i+1,arr[i]};
            }
        }
          return new int[] {-1,-1};
    }
}
