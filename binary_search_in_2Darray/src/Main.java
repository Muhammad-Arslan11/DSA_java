import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int target = 6;

        System.out.println(Arrays.toString(binarySearchIn2Darray(arr,target)));
    }

    static int[] binarySearchIn2Darray(int[][] matrix,int target){
         int r = 0;
         int c = matrix.length-1;

        while (r < matrix.length && c >= 0) {

            //case1: if elem == target
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }
            // case2: if elem < target
            if(matrix[r][c] < target){
                r++;
            }
            else{
                c--;
            }
        }
        // if no ans found
        return  new int[]{-1,-1};
    }
}