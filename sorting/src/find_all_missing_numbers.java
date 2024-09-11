import java.util.ArrayList;
import java.util.List;

public class find_all_missing_numbers {
    public static void main(String[] args) {
    int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(cyclicSort(arr));

    }

    static List<Integer> cyclicSort(int[] arr) {
        int index = 0;


        while (index < arr.length) {
            int correctIndex = arr[index]-1;
            // check whether the elem is at its correct index or not
            if (arr[index] != arr[correctIndex] )  {
                // swap
                int temp = arr[index];
                arr[index] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                index++;
            }

        }


     // find all missing numbers
        List<Integer> ans  = new ArrayList<>();
        for(int i=0; i< arr.length; i++) {
            if(arr[i] != i + 1){
                ans.add(i + 1);
            }
        }
        return ans;
    }

}
