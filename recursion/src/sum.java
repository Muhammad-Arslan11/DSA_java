public class sum {

    public static void main(String[] args) {

        int factorial = sum(10);
        System.out.println(factorial);

    }

    static int sum(int n){
        // base condition
        if(n==0 || n==1){
            return 1;
        }
        // recursive call
        return n + sum(n-1);
    }
}
