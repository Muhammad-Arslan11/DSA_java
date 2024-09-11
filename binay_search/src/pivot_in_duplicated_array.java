public class pivot_in_duplicated_array {
    public static void main(String[] args) {
//      int[] dupArray = {2,2,2,9,2};
        int[] dupArray = {2,2,9};
        System.out.println(findPivot(dupArray));
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // mid
            int mid = start + (end - start) / 2;
            // case 1
            if (end > mid && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            }
            // case2
            if((start < mid) && (arr[mid] < arr[mid - 1])){
                return  arr[mid -1];
            }

            // if start, mid, and end is equal
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                // check if start and end both are pivot
                if(arr[start] > arr[start+1]){
                    return arr[start];
                }
                start++;
                if(arr[end] < arr[end-1]){
                    return arr[end-1];
                }
                end--;
            }
            else if(arr[start] < arr[mid] || (arr[mid] == arr[start] && arr[mid] > arr[end])){
                  start = mid+1;
            }
            else{
                end = end-1;
            }
        }
        return -1;
    }
}
