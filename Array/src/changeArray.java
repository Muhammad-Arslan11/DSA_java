
import java.util.Arrays;
public class changeArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        // before changing the array
        System.out.println(Arrays.toString(arr));
        change(arr); // this function will change the original array since the reference
        // of original array is passed to function


        // after changing the array
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr){
        arr[0] = 4;
    }

}
