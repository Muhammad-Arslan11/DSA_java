public class patterns {
    public static void main(String[] args) {
        // VERY IMPORTANT INSTRUCTIONS FOR PATTERN PRINTING

        /* (1) Whenever you are required to print any specific pattern, run the outer for loop no. of
        *  times equal to number of rows
        *  (2) Run the inner for loop no. of times equal to the number of rows of outer for loop
        *  (3) Figure out what do you need to print
        *  (4) Always print a new line every time the outer for loop executes
        *
        *
        * */
        pattern4(5);
 }
        // patter no. 2
//    static void pattern2(int n){
//        // step no.1: run outer loop times equal to the no. of rows
//        for(int rows = 1; rows <= n; rows++){
//            // step no.2: run the inner loop times equal to the no. of rows
//            for(int col = 1; col <= rows; col++){
//                // step no. 3: print the pattern
//                System.out.print("* ");
//            }
//            // step no.4: print newline
//            System.out.println();
//
//        }
   // }

    // patter no. 3
    static void pattern3(int n){
        // step no.1: run outer loop times equal to the no. of rows
       for(int rows = 1; rows <= n; rows++){
//            // step no.2: run the inner loop times equal to the no. of rows
            for(int col = 0; col <= n-rows; col++){
//                // step no. 3: print the pattern
                System.out.print("* ");

            }
//            // step no.4: print newline
            System.out.println();
//
        }
    }

    // pattern no. 4:
    static void pattern4(int n){
        // outer loop will run less than or equal to n
        for(int row =1; row <= n; row++){
            // inner loop will run n-row times
            for(int col=1; col <=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    // pattern no. 5:
     static void pattern5(int n){
        //  outer loop will run 2 * n times
         for(int row = 0; row < 2 * n; row++){
             // determine col
             // if row < n: col = row; if row > n: 2* n - row;
             int colInRow;
              if(row > n){
                  colInRow = 2 * n - row;
              }else{
                   colInRow  = row;
              }

             // inner for loop will run col times
             for(int col=0; col < colInRow; col ++){
                 System.out.print("* ");
             }
             System.out.println();
         }
     }

     // pattern no. 6
     static void pattern6(int n){
        // outer loop will run n times
         for(int row =0; row < n; row++){
             // inner loop will also run n times
             for(int col = 0; col < n; col++){
                 // check if the col is > (row - n - 1): then print *
                 if( col > row - n -1){

                 }
             }
         }
     }

}
