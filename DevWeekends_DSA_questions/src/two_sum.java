import java.util.Arrays;

public class two_sum {

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] arr1 = {3,2,4};

        System.out.println(Arrays.toString(twoSum(arr,9)));
        System.out.println(Arrays.toString(twoSum(arr1,6)));



    }

    static int[] twoSum(int[] nums, int target) {

         int n = nums.length;
        for(int i = 0; i<n ;){
            for(int j =1; j < n-i-1; ){
                if (nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
                // increment j
                j++;
            }
            // incement i
            i++;
        }
        // if ans not found
return new int[]{-1,-1};
    }
}
