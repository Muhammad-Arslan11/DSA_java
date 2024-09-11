public class binary_search {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,8,10,23,55};
        int target = 8;

        // method call
        int ans = binarySearch(nums, target);
        System.out.println(ans);

    }

    static int binarySearch(int[] arr, int target){
        // resolve edge cases
      if(arr == null || arr.length == 0){
            return -1;
        }

        int left = 0;
        int right = arr.length-1;

        while(left <= right){

            int mid = left + (right - left)/2;
//         if mid is greater than target
            if(arr[mid] > target){
                right = mid -1;

            }
            // if mid less than target
            else if(arr[mid] < target){
                left = mid+1;
            }
            // if mid = target
            else{
                return arr[mid];
            }
        }


// return -1 if target not found
        return -1;
    }
}
