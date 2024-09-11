import java.util.HashSet;

public class find_duplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,3,2,1};
        int[] arr = {1,23,4};

        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate(arr));
//        System.out.println(arr.length -1);
    }

    static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> mySet = new HashSet<>();  // create new hashset
        // put each element in mySet
        for(int elem : nums){
            // first check if mySet contains elem. If yes, return true
            if(mySet.contains(elem)){
                return true;
            }
            // add each elem in mySet
            mySet.add(elem);
        }

   return false;
    }
}
