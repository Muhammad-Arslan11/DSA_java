import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {5,0,3,9,8,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for(int i=0; i< arr.length; i++) {
            // find the max item and swap it with the last index
            int lastIndex = arr.length - i - 1;
            int maxIndex = 0;

 //          find the max item
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // swap the maxItem with the lastIndex
            int temp = arr[maxIndex];
           arr[maxIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
        }
    }
}
