public class sum_of_digits {

    public static void main(String[] args) {

        System.out.println(sumOfDigits(12345));
    }


     // this is the normal or non-recursive way to find the sum of digits
//    static int sumOfDigits(int n) {
//        int sum = 0;
//        while (n != 0) {
//            int remainder = n % 10; // Corrected this line
//            sum += remainder;
//            n /= 10; // Added this line to divide n by 10
//        }
//        return sum;
//    }

     // here we are using recursion to find the sum of digits
    static int sumOfDigits(int n) {
         if(n ==0){
             return 0;
         }
        return (n % 10) + sumOfDigits(n / 10);
    }


}

