public class smallest_letter {
    public static void main(String[] args) {
//         char[] charac = {'a', 'b', 'f', 'k', 'h'};
        char[] charac = {'c', 'f', 'j'};
         char target = 'c';

         // method call
        System.out.println(smallest_letter(charac, target));
    }

    static char smallest_letter(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;

        if(arr[end] < target){
            return arr[start];
        }

        // apply binary search
        while (start < end) {
            // mid
            int mid = start + (end - start) / 2;


            if(arr[mid] > target){
                end = mid-1;
            }
            else  {
                start = mid+1;
            }

        }
        return arr[start];
    }
}
