public class palindrom_checker {
    public static void main(String[] args) {

        String str = "abbccbba";
        String str1 = "madam";
        String str2 = "arslan";
        System.out.println(palindrom(str, 0, str.length()-1));
        System.out.println(palindrom(str1, 0, str1.length()-1));
        System.out.println(palindrom(str2, 0, str2.length()-1));
    }

    static boolean palindrom(String str, int start, int end){

        //  base condition
        if(start >= end){
            return true;
        }


        if(str.charAt(start) != str.charAt(end)){
            return false;
        }


        // recursive call
        return palindrom(str, start+1, end-1);
    }
}
