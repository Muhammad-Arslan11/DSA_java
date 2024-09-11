import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] arr = new int[6];

        // print the elements of array using for loop
//      int index ;
//      int end  = arr.length;
//       for( index =0; index <= end; index++ ){
//        System.out.println(arr[index]);
//    }

//      // do the same with enhanced for loop
//          for(int element: arr){
//              System.out.println(element);
   // }

        // take the input of array
         Scanner in = new Scanner(System.in);
        System.out.println("input the elements");

         for(int index = 0; index < arr.length; index++){
             arr[index] = in.nextInt();
             System.out.println();


         }
      // display the input

                for(int i = 0; i<= arr.length; i++){
                    System.out.println(arr[i]);

                }






    }


}
