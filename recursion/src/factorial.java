public class factorial {

    public static void main(String[] args) {

        int factorial = fact(10);
        System.out.println(factorial);

    }

    static int fact(int n){
        // base condition
        if(n==0 || n==1){
            return 1;
        }
        // recursive call
        return n * fact(n-1);
    }
}
