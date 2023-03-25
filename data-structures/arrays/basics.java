package practice;
import java.util.Scanner;



public class basics {

    public static boolean isPrime(int value){
        if(value <= 1){
            return false;
        }
        for(int i=2;i< Math.sqrt(value);i++){
            if(value%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);
        // int values[] = {2,3,4,5,6};
        // String given = "new language";
        // System.out.print("Here we gooo");
        // System.out.println(" - " + given);

        // char x = 'X';

        // for(int i=0;i<values.length;i++){
        //     System.out.println(values[i] + " " + x);
        //     x++;
        // }
        
        System.out.print("What's the number? ");
        int val = fetch.nextInt();
        System.out.println("Is " + val +" a prime number? " + isPrime(val));

        fetch.close();
    }
}
