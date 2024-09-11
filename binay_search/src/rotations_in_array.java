public class rotations_in_array {
    public static void main(String[] args) {
        int[] arr = {7,8,9,10,1,2,3,4,5,6};

        System.out.println(rotations(arr));
    }

    static int  rotations(int[] arr){
        int pivot = findPivot(arr);
        return pivot +1;
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

            // if start, mid, and end is equal
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                // check if start and end both are pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end-1]){
                    return end-1;
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
