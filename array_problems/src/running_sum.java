import java.util.Arrays;

public class running_sum {
    public static void main(String[] args) {
     int[] arr = {1,2,3,4};

        System.out.println(Arrays.toString(runningSum(arr)));
    }

    static int[] runningSum(int[] nums) {
        int[] newArr = new int[nums.length];

       int sum = 0;
        for(int i= 0; i<nums.length; i++){
            sum+= nums[i];
            newArr[i] = sum;

        }

    return  newArr;
    }
}
