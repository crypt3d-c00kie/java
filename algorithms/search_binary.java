package practice;

// import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class search_binary {
    
    public static boolean binarySearch(Vector<Integer> arr, int xTarget){
        int low = 0;
        int high = arr.size()-1;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(arr.get(mid) == xTarget){
                return true;
            }
            else if(arr.get(mid) < xTarget){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        
        System.out.print("Number of elements :: "); 
        int n = fetch.nextInt();

        System.out.print("Given :: ");
        Vector<Integer> given = new Vector<Integer>();

        for(int i=0;i<n;i++){
            int tmp = fetch.nextInt();
            given.add(tmp);
        }

        System.out.print("Value to search for :: ");
        int xTarget = fetch.nextInt();

        // search_binary s=new search_binary();
        if(binarySearch(given, xTarget)){
            System.out.println("The given element exist!!");
        }
        else{
            System.out.println("404 value not found");
        }

        fetch.close();
    }
}
