public class print_numbers {

    public static void main(String[] args) {
        int numbers = printNum(10);
        //System.out.println(numbers);
    }

    static int printNum(int n){
        // process
        System.out.println(n);
        // base condition
        if(n ==0){
            return 1;
        }
        // recursive call
        return printNum(n-1); // this recursive call will print number from n to 0


    }
}
