public class find_the_duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 6, 7, 4, 3, 2,2,5};

        System.out.println(find_duplicate(arr));
    }


    static int find_duplicate(int[] arr) {
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
            if (arr[index] != index + 1) {
                int correctIndex = arr[index] - 1;
                if (arr[index] != arr[correctIndex]) { // what is this check doing?
//                // swap
                    int temp = arr[index];
                    arr[index] = arr[correctIndex];
                    arr[correctIndex] = temp;
                } else {
                    return arr[index];
                }
            } else {
                index++;
            }

        }
         // if no duplicate found
        return -1;
    }

//
//  static int duplicate_finder(int[] arr){
//        // check whether the value == index of array
//        for(int i=0; i< arr.length; i++){
//            if(arr[i] != i+1){ // value == index + 1
//                return arr[i];
//            }
//        }
//        // if no ans found
//        return -1;
//    }
}
