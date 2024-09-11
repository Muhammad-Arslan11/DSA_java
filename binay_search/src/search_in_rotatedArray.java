public class search_in_rotatedArray {
    public static void main(String[] args) {
//
//        int[] nums = {3,5,1};
//        int target = 3;

         int [] nums = {4,5,6,6,7,0,1,2,4,4};


        // method call
//        System.out.println(searchInRotatedArray(nums,target));
        System.out.println(findPivot(nums));
        }

    static int searchInRotatedArray(int[] arr, int target) {
       int pivot = findPivot(arr);

       // check whether the given array is rotated or not
        if(pivot == -1){
            // do normal binary search
            return binarySearch(arr,target,0, arr.length-1);
        }
        // three conditions
        //(1) if target = pivot
        if(target == arr[pivot]){
            return pivot;
        }
        //(2) if target > start
        if(target > arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        //(3) if target < start
        return  binarySearch(arr,target,pivot+1, arr.length-1);

    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // mid
            int mid = start + (end - start) / 2;
            // case 1
            if (end > mid && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // case2
            if((start < mid) && (arr[mid] < arr[mid - 1])){
                return  mid -1;
            }
            // case3
            if(arr[mid] <= arr[start]){
              end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }


    static int binarySearch(int[] arr, int target,int start, int end){
        // resolve edge cases
        if(arr == null || arr.length == 0){
            return -1;
        }

        while(start <= end){

            int mid = start + (end - start)/2;
//         if mid is greater than target
            if(arr[mid] > target){
                end = mid -1;

            }
            // if mid less than target
            else if(arr[mid] < target){
                start = mid+1;
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
