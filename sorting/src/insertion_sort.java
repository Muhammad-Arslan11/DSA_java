import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {5,0,3,9,8,2};
        insertionSort(arr);;
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        for (int i= 0; i< arr.length-1; i++){
            for(int j= i+1; j>0; j--){
                // check whether the elem is smaller than the next elem
                if(arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
