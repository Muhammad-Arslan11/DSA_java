import java.util.Arrays;

public class largest_customer_wealth {

    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};

        System.out.println(maximumWealth(accounts));


    }

    static int maximumWealth(int[][] accounts) {

        int largestWealth = Integer.MIN_VALUE;
        for(int i = 0; i< accounts.length; i++){

            int sumOfWealth = 0;
            for(int j = 0; j < accounts[i].length; j++ ){
                sumOfWealth += accounts[i][j];
            }
            if(sumOfWealth > largestWealth){
                largestWealth = sumOfWealth;
            }
        }
    return largestWealth;
    }
}
