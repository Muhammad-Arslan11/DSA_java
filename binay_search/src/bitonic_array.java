public class bitonic_array {
    public static void main(String[] args) {
        int[] nums = {1,2,5,6,8,7,3,1};

        // method call
        System.out.println(findInBitonic(nums));

    }

    static int findInBitonic(int[] arr){
        if(arr == null || arr.length == 0){
            return -1;
        }

        int left = 0;
        int right = arr.length-1;

        while(left < right){

            int mid = left + (right - left)/2;
//         if mid is less than mid+1,it means you are in increasing
//         part of the array. Move to the right.
            if(arr[mid] < arr[mid+1]){
                left = mid+1;

            }
 //         if mid is greater than mid+1, it means you are in decreasing
  //        part of the array. Move to the left
            else {
                right = mid; // no need to write mid-1 because mid might be the possible answer.

            }

        }



        return arr[left]; // or return arr[right];
    }
}
