


public   class linear_search {

    // search in range
//    static int searchInRange(int[] arr, int target, int start, int end) {
//        // check for egde cases
//        if (arr.length == 0 || arr == null) {
//            System.out.println("empty array");
//        }
//        if (start > end) {
//            System.out.println("start is greater than end");
//        }
//
//        // for loop
//
//        for (int i = start; i <= end; i++) {
//            int element = arr[i];
//            if (element == target) {
//                return i;
//            }
//        }
//        return -1;
//    }

    // search the minimum number in an array
//    static int minimumNumFinder(int[] arr) {
//        // edge case
//        if (arr == null || arr.length == 0) {
//            System.out.println("empty array");
//        }
//
//        // run a for loop
//        int min = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        return min;
//    }

//    static boolean search(String str, char target) {
//        // edge case
//        if (str.length() == 0) {
//            return false;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            if (target == str.charAt(i)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
    // searching in 2D array
//     static int search2Darray(int[][] arr, int  target){
//
//        // edge case
//          if(arr == null || arr.length == 0){
//              System.out.println("empty array");
//          }
//
//          // run  enhanced for loop
//         for(int[] row : arr){
//             // check if the row is empty
//             if(row == null || row.length == 0){
//                 continue;
//             }
//
//             for(int col : row){
//                 if(col == target){
//                     return col;
//                 }
//             }
//         }
//         return -1;
//     }


     // even number finder
//    static int evenNumFinder(int[] arr){
//
//         int even = 0;
//        for(int num : arr){
//           int digits = even(num);
//           if(digits % 2 == 0){
//               even++;
//           }
//        }
//      return even;
//    }
//
////     function to check whether the num is even
//    static int even(int num){
//
//        int count  = 0;
//        while(num > 0){
//            count++;
//            num /= 10; // divide the num by 10 on every iteration
//        }
//      return count;
//    }



    // algorithm to calculate the sum of wealth
//     static int maxWealth(int[][] arr){
//
//         // edge cases
//         if(arr == null || arr.length == 0){
//             return -1;
//         }
//
//         // run a for loop
//         int ans = Integer.MIN_VALUE; // this will hold the sum of greater wealth of a person
//
//          for(int[] person : arr){
//              // if any of the row of arr is empty
//              if( person == null || person.length == 0){
//                  continue;
//              }
//
//              int sum =0;
//              for(int account : person) {
//                  sum += account;
//              }
//              if(sum > ans ){
//                  ans = sum;
//              }
//          }
//
//         return ans;
//     }

    public static void main(String[] args) {
//        String name = "MuhammadArslanShah";
////        char target  = 'A';
//        char target = 'l';
//        int start = name.charAt(6);
//        int end  = name.charAt(12);

//        int[] nums = {1, 6, 9, 23, 76, -65, -9, 45};
//        int target = 23;

//         int[][]  arr2D  = {
//                 {1,2,3},
//                 {4,5,6},
//                 {7,7,9}
//         };
//
//         int target = 6;
      //  int[] arr = {34, 234, 6543, 1, 76};

//
//        int[][]  accounts = {
//                {1,2,3},
//                {5,6,1},
//                {4,7,7},
//                {2,8,1}
//        };


        // call the method
//        System.out.println(search(name, target));
//        System.out.println(searchInRange(nums, target,2, 6));
//        System.out.println(minimumNumFinder(nums));
//        System.out.println(search2Darray(arr2D, target));
       // System.out.println(evenNumFinder(arr));
       // System.out.println(maxWealth(accounts));
   }

}





