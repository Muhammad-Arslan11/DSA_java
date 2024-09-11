import java.util.ArrayList;
import java.util.Arrays;

public class array_concatenation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(getConcatenation(arr)));



    }

    static int[] getConcatenation(int[] nums) {


        int length = nums.length;
        // create array of length double of nums array
        int[] newArr = new int[length * 2];

        // run a for loop
        for (int i = 0; i < nums.length; i++) {
            newArr[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            newArr[i + length] = nums[i];
        }


        return newArr;
    }

}
