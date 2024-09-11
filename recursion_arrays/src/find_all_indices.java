import java.lang.reflect.Array;
import java.util.ArrayList;

public class find_all_indices {
    public static void main(String[] args) {
        int[] arr = {1,4,5,3,18,9,18};

        System.out.println(findAllIndices(arr,18,0, new ArrayList<>()));
    }


    static ArrayList findAllIndices(int[] arr, int target, int index, ArrayList<Integer> list){
         if( index == arr.length){
             return list;
         }

        if (arr[index] == target){
            list.add(index);
        }
          return   findAllIndices(arr,target, index+1, list);

    }
}
