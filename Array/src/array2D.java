
import java.util.Arrays;

public class array2D {
    // print 2D array using conventional for loop
//    static void print2Darray(int[][] arr){
//        // use for loop
//         for(int row = 0; row < arr.length; row++){
//             System.out.print("[");
//              for(int col = 0; col < arr[row].length; col ++){
//                  System.out.print( arr[row][col] + " ");
//
//              }
//             System.out.print("]");
//             System.out.println();
//         }
//    }

    // print 2D array using enhanced for loop
    static void print2Darray(int[][] arr){
        // use enhanced for loop
        for(int[] row : arr){
            System.out.println(Arrays.toString(row ));
        }

    }


    public static void main(String[] args)
    {
        //syntax of a 2D array
        int[][] arr2D = {
                {1,2,3},
                {4,5,6},
                {7,8,9},

        };

        print2Darray(arr2D);
    }
}