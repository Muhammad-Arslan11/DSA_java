public class find_sqrt
{
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }
    static int mySqrt(int x) {
        int start;
        int end = x+1;

        // while(start < end){
        //     int mid = start + (end - start) /2;

        //     if(mid*mid > x){
        //         end = mid;
        //     }else{
        //         start = mid+1;
        //     }
        // }
        for(start=0; start < end; start++){
            //calculate mid
            int mid = start + (end - start) /2;

            if(mid*mid > x){
                end = mid;
            }else{
                start = mid+1;

            }


        }
        return start -1;
    }
}



