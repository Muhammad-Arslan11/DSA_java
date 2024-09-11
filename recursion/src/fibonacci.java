public class fibonacci {

    public static void main(String[] args) {

        int fibonacci = fibo(10);
        System.out.println(fibonacci);

    }

    static int fibo(int n){
        // base condition
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        // recursive call
        return fibo(n-1) + fibo(n-2);
    }
}
