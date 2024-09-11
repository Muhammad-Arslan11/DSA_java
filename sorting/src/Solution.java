class Solution {



    public void missingNumber(int[] arr) {

      
        int index = 0;


        while (index < arr.length) {
            // check whether the elem is at its correct index or not
            if (arr[index] != index  && arr[index] < arr.length)  {
                // swap
                int temp = arr[index];
                arr[index] = index;
                index = temp;
            } else {
                index++;
            }
        }
        
    }

    

     public int num_finder(int[] arr){
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





