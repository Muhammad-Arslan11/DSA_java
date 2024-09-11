public class reverse_number {
    static int sum  = 0;
    static void reverse(int n){
        // base condition
        if(n ==0){
            return;
        }
        // get the remainder
        int remainder = n % 10;
        sum = sum *10 + remainder;

        // recursive call
        reverse(n/10);
    }


    public static void main(String[] args) {
        reverse(12345);
        System.out.println(sum);// output: 54321
    }


}
