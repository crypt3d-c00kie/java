package practice;

import java.util.Collections;
// import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class arr_hasDuplicate {
    // using hashset
    // public static boolean hasDupe(Vector<Integer> given){
    //     HashSet<Integer> hxSet = new HashSet<Integer>();
    //     for(int i : given){
    //         if(hxSet.contains(i)){
    //             return true;
    //         }
    //         else{
    //             hxSet.add(i);
    //         }
    //     }
    //     return false;
    // } 

    public static boolean hasDuplicate(Vector<Integer> given){
        Collections.sort(given);

        for(int i=0;i<given.size()-1; i++){
            if(given.get(i) == given.get(i+1)){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner fetch = new Scanner(System.in);
        Vector<Integer> given = new Vector<Integer>();

        System.out.print("Number of elements :: ");
        int n = fetch.nextInt();

        System.out.print("Given :: ");
        for(int i=0;i<n;i++){ 
            int tmp = fetch.nextInt();
            given.add(tmp);
        }

        System.out.println("Does this array has duplicates?? " + hasDuplicate(given));

        fetch.close();
    }
}
