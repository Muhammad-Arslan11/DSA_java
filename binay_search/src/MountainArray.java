public class MountainArray {
    public static void main(String[] args) {
     int[] arr = {1,4,7,10,12,15,14,9,7,3,2,0};
     int target = 4;

     // method call
        System.out.println(search(arr,target));

    }

    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);

       int firstTry  =  orderAgnosticBinarySearch(arr,target, 0,peak);
       if(firstTry != -1){
           return firstTry;
       }

       return orderAgnosticBinarySearch(arr,target, peak+1,arr.length-1);


    }

    static int peakIndexInMountainArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;
//         if mid is less than mid+1,it means you are in increasing
//         part of the array. Move to the right.
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;

            }
            //         if mid is greater than mid+1, it means you are in decreasing
            //        part of the array. Move to the left
            else {
                right = mid; // no need to write mid-1 because mid might be the possible answer.

            }

        }
        return left; // or return arr[right];
    }


    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end){
        // find whether the array is in ascending order or descending order
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            // find the mid
            int mid = start + (end - start)/2;

            // if target is  = arr[mid]
            if(arr[mid] == target){
                return arr[mid]; //return the index
            }


            if(isAsc){
                if(arr[mid] < target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(arr[mid] < target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }

        }

        return -1;
    }
}
