import java.util.Arrays;

public class bubble_sort
{
    public static void main(String[] args) {
    int[] arr = {5,0,3,9,8,2};
     bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        for (int i=0; i< arr.length; i++){

            for (int j=0; j< arr.length-i-1; j++){
                 if(arr[j] > arr[j+1]){
                     // swap arr[j] with arr[+1]
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                 }
            }
        }
    }
}
