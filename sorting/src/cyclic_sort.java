import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {5,3,1,4,2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int index = 0;


        while (index < arr.length) {
            int correctIndex = arr[index] - 1;
            // check whether the elem is at its correct index or not
            if (arr[index] != arr[correctIndex]) {
                // swap
                int temp = arr[index];
                arr[index] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                index++;
            }
        }

    }
}
