
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
import java.util.ArrayList;



public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // syntax of an Arraylist
        ArrayList<Integer> list = new ArrayList<>(5);

        // input items in ArrayList
        System.out.println("input values: ");
        for(int item = 0; item < 5; item++){
            int value  = in.nextInt();
           list.add(value);
        }

         // print the values of arraylist
        for(int i =0; i<5; i++){
            System.out.println(list.get(i));
        }

    }

}
