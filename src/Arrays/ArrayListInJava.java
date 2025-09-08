package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr.get(2));
        arr.set(2,30);
        arr.add(78);
        arr.add(1, 10);
        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);

        int i=0, j=arr.size()-1;
        while (i<j){
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }

        //Collections.reverse(arr);
        System.out.println(arr);
    }
}
