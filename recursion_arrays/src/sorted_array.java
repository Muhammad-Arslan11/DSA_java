import java.util.Arrays;

public class sorted_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr1 = {1,3,6,2,7,10};

//        System.out.println(sorted(arr,0));
        System.out.println(sorted(arr1,0));

    }

    static boolean sorted(int[] arr, int index){
        // Base condition
        if(index == arr.length -1){
            return true;
        }
        // recursive call
        return arr[index] < arr[index+1] && sorted(arr, index+1);
    }
}
