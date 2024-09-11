public class linear_search_with_recursion {
    public static void main(String[] args) {

          int[] arr = {1,4,5,3,18,9};
          int[] arr1 = {1,2,3,4};

        System.out.println(findElem(arr,18,0));
        System.out.println(findElem(arr1,18,0));
    }

    static boolean findElem(int[] arr, int target, int index){
        // base condition
        if(index == arr.length){
            return false;
        }
        // recursive call
       return  arr[index] == target || findElem(arr, target, index+1);
    }
}
