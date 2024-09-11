import java.util.Arrays;

public class binary_search_in_sorted_matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.println(Arrays.toString(search(matrix,15)));
    }

    static int[] search(int[][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        // check whether only one row exists in the matrix
        if(rows == 1){
            return binary_search(matrix,0, 0, cols-1,target);
        }

        // if matrix contains multiple rows and columns
        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols / 2;

        // run the loop till 2 rows are remaining
        while(rStart <(rEnd -1) ){
            // mid
            int mid = rStart + (rEnd - rStart) / 2;
//         3 cases
            // case1: if elem == target
            if(matrix[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            // case2: if elem < target
            if(matrix[mid][cMid] < target){
                rStart  = mid;
            }
            else{
                // this means, matrix[mid][cMid] > target
                rEnd = mid;
            }
        }

        // from now on, only two rows are remaining
        // check in the first row
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        // check in the second row
        if(matrix[rStart+1][cMid] == target){
            return new int[]{rStart+1,cMid};
        }


        // after that, only 4 halves of two-row-matrix are remaining
        // search in half 1
        if(target <= matrix[rStart][cMid-1]){
            return binary_search(matrix,rStart,0,cMid-1,target);
        }
        // search in half 2
        if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols - 1]){
            return binary_search(matrix,rStart,cMid+1,cols-1,target);

        }
        // search in half 3
        if(target <=  matrix[rStart+1][cMid-1]){
            return binary_search(matrix,rStart+1,0,cMid-1,target);
        }
        // search in half 4
        else{
            return binary_search(matrix,rStart+1,cMid+1,cols-1,target);
        }

    }

    static int[] binary_search(int[][] matrix,int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            // mid
            int mid = cStart + (cEnd - cStart) / 2;

            // 3 cases:
            // case1: if target == elem
            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            // case2: if target < elem
            if(matrix[row][mid] < target){
                cStart = mid+1;
            }
            // case3: if target > elem
            else{
                cEnd = mid-1;
            }
        }
        // if target not found
        return new int[]{-1,-1};
    }
}
