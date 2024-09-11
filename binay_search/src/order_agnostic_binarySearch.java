public class order_agnostic_binarySearch {
    public static void main(String[] args) {
//       int[] arr = {1,2,6,9,10,23,56,99}; // ascending order

        int[] arr = {99,56,23,10,9,6,2,0}; // descending order
       int target = 2;
       int start = 0;
       int end = arr.length-1;

       // method call
        System.out.println(orderAgnosticBinarySearch(arr,target,start,end));
    }

    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end){
        // find whether the array is in ascending order or descending order
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            // find the mid
            int mid = start + (end - start)/2;

            // if target is  = arr[mid]
            if(arr[mid] == target){
                return mid; //return the index
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
