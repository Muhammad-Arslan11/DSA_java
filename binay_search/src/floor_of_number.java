public class floor_of_number {
    public static void main(String[] args) {

        int[] nums = {1,6,9,10,14,15,19};
        int target =  13;

        System.out.println(floorOfNumber(nums, target));
    }

    // floor of a number
    static int floorOfNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // apply binary search
        while (start <= end) {
            // mid
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return arr[mid];
            }

            if(arr[mid] > target){
                end = mid-1;
            }
            else  {
                start = mid+1;
            }

        }
        return arr[end];
    }
}
