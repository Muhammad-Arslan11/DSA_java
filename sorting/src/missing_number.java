public class missing_number {
    public static void main(String[] args) {
        int[] arr = {0,3,2,1,5};
        cyclicSort(arr);
        System.out.println(num_finder(arr));
    }


    static void cyclicSort(int[] arr) {
        int index = 0;


        while (index < arr.length) {
            int correctIndex = arr[index];
            // check whether the elem is at its correct index or not
            if (arr[index] != index  && arr[index] < arr.length)  {
                // swap
                int temp = arr[index];
                arr[index] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                index++;
            }
        }

    }

    static int num_finder(int[] arr){
        // check whether the value == index of array
        for(int i=0; i< arr.length; i++){
            if(i != arr[i]){
                return i;
            }
        }
        // if no ans found
        return arr.length;
    }
}
