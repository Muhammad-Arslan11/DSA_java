public class Infinite_array {

    public static void main(String[] args) {
        int[] nums = {1,4,7,8,10,23,45,78,89,90,123,456,700,7001,804};
        int target = 10;

        System.out.println(findInInfiniteArray(nums,target));

    }

    static int findInInfiniteArray(int[] arr, int target){

        int start = 0;
        int end = 1;

        while(target > arr[end]){
            // update start and end
            int newStart = end+1;
            end = end + (end - start +1) * 2;  // double the size of array chunk
            start = newStart;
        }

        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){


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
