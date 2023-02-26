package practice;
import java.util.ArrayList;
import java.util.Scanner;

public class search_linear {

    public static boolean linearSearch(ArrayList<Integer> arr, int target) {

        for(int x : arr){
            if(x == target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        ArrayList<Integer> nlist = new ArrayList<Integer>(); 

        System.out.print("Number of values :: ");
        int n = fetch.nextInt();

        System.out.print("Given :: ");

        for(int i=0;i<n;i++){
            int tmp = fetch.nextInt();
            nlist.add(tmp);
        }

        System.out.print("Target element :: ");
        int xTarget = fetch.nextInt();
        
        if(linearSearch(nlist, xTarget)){
            System.out.println("The value " + xTarget + " is found!");
        }
        else{
            System.out.println("Value doesn't exist");
        }
        
        fetch.close();
    }
}
