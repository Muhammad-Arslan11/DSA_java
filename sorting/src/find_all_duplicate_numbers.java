import java.util.ArrayList;
import java.util.List;

public class find_all_duplicate_numbers {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(duplicate_finder(arr));
    }

    static List<Integer> duplicate_finder(int[] arr) {
        int index = 0;

        while (index < arr.length) {
            // first approach

//            int correctIndex = arr[index] -1;
//            // check whether the elem is at its correct index or not
//            if (arr[index] != arr[correctIndex])  {
//                // swap
//                int temp = arr[index];
//                arr[index] = arr[correctIndex];
//                arr[correctIndex] = temp;
//            } else {
//                index++;
//            }
            // second approach
            if (arr[index] != index + 1) { // this check is checking whether the number is at correct index or not
                int correctIndex = arr[index] - 1;
                if (arr[index] != arr[correctIndex]) { // what is this check doing?
                    // This check is basically checking whether the number is duplicate or not.
                    // if this check fails, it means the number is duplicate

                    // swap
                    int temp = arr[index];
                    arr[index] = arr[correctIndex];
                    arr[correctIndex] = temp;
                } else {
                    index++;
                }
            } else {
                index++;
            }

        }

        List<Integer> ans = new ArrayList<>();
        for(int i=0; i< arr.length; i++) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != i + 1 && arr[i] == arr[correctIndex]) { // check whether the number is duplicate or not. Only add duplicates in the array
                ans.add(arr[i]);
            }
        }
        // return the ans
        return ans;

    }

//    static List<Integer> duplicate_finder(int[] arr){
//        // create an ArrayList
//        List<Integer> ans = new ArrayList<>();
//        // check whether the value == index of array
//        for(int i=0; i< arr.length; i++){
//            if(arr[i] != i+1 && !ans.contains(arr[i])){ // value == index + 1
//                ans.add(arr[i]);
//            }
//        }
//        // if no ans found
//        return ans;
  //  }
}
