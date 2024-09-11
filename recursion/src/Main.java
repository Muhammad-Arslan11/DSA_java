public class Main {
    public static void main(String[] args)
    {
        int[] arr = {1,8,9,10,23,45,55};

        int ans = recursive_binary_search(arr,5,0,arr.length-1);
        System.out.println(ans);

    }

    static int recursive_binary_search(int[] arr, int target, int s, int e){

        if(s > e){
            return -1;
        }

        // calculate mid
        int mid = s + (e - s) / 2;

        if(arr[mid] == target){
            return arr[mid];
        }
        if(target < arr[mid]){
            return  recursive_binary_search(arr,target,s,mid-1);
        }
        else {
            return  recursive_binary_search(arr,target,mid+1,e);
        }

    }
}