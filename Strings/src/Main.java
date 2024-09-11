import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
  /*   (1) Strings are immutable in java due to security reasons
  *    (2) use == operator to check whether the strings are equal or not. For true, it means both of strings are actually
  *  pointing to the same object in heap string pool.
  *    (3) If == operator gives false, that means both of strings are not pointing to the same object.
  *    (4) You can always create a new String object if you want by using new keyword. In this way you can avoid java's
  *  automatic references (only those objects will be assigned to the same objects whose values are same) assigning to string pool of heap memory.
  *    (5) toString():  an important note about toString() method: whatever datatype you give to toString() method, it will print
  *  string only.
  *    (6) (+) operator in java is only applicable to either primitives or if any one of the value is string. As a result
  *  it will generate concatenated string.
  *    (7) In java if you use (+) operator between two char values, it will convert char values to their respective
  *  unicode values and then add both values. However, if you do that with both strings, it will then just concatenate the strings.
  *   (8) String Performance:  If you concatenate two or more objects of type char, string, or whatever, new objects will be created everytime.
  *  This is because you cannot change strings. Hence, the strings are immutable. All other objects created before will be derefernced
  *  and garbage collector will destroy them from memory. The time complexity will be O(N^2).
  *
  *  Below code explains above written statements by examples
  *  */

        // EXAMPLE 1:
//         String name = "Arslan";
//
//         String  name1 = "Arslan";
         // both references are pointing to the same object because of string pool
       // System.out.println(name == name1); // true

        // EXAMPLE2:
        // create a new object by using new keyword
      //  String name2 = new String("Arslan");
      //  System.out.println(name == name2); // false. Because new keyword creates new object in the heap memory outside of pool

//      EXAMPLE 3:

//        System.out.println('a' + 'b'); // char values will be converted to unicode values and then be added.
//        System.out.println("a" + "b"); // both string values will be concatenated
//        System.out.println('a' + "b"); // string b will be concatenated with the unicode value of char a
//        System.out.println(1 + "b"); // 1 will be concatenated with the string b
//        System.out.println("b" +new ArrayList<>()); // if you use any wrapper class, then that wrapper class will call
//        // its own toString() to convert that class into string then it will be concatenated
//        String ans = new Integer(10) + "b"; // in this case the Integer wrapper class converts the value to string and then concatenates with b string
//        System.out.println(ans);

        // ARGUMENTS FOR PALINDROME CHECKER PROGRAM
         String str = "abcdcba";
         String str1  = "abcdef";
        System.out.println(palindromeChecker(str));
        System.out.println(palindromeChecker(str1));

    }

    static boolean palindromeChecker(String str){
        int start  =0;
        int end = str.length()-1;

         while(start < end){
             // check whether the start is equal to end or not
             if(str.charAt(start) != str.charAt(end)){
                 return false;
             }
             start++; // update start
             end--; // update end
         }
         return true;
    }
}