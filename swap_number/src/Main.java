public class Main {

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;


    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a + " "+ b);
        swap(a,b);
        System.out.println( "after swap: " + a +" "+ b );

    }
    // cannot swap two primitive data types in java because of 'no-pass-by-reference'


}