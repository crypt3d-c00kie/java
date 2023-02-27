package practice;
import java.util.Scanner;

public class math_armstrong_number {
    
    public static boolean isArmstrong(int given){
        // 153 = 1^3 + 5^3 + 3^3 = 153
        // 1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1634
        int old = given;
        int sum = 0;

        while (given > 0){
            int remainder = given%10;
            given /= 10;
            sum = sum + remainder * remainder * remainder;
        }
        return old == sum;
    }
    public static void main(String[] args) {
        Scanner fetch = new Scanner(System.in);

        System.out.print("Given number :: ");
        int given = fetch.nextInt();

        System.out.println("Is this an armstrong number?? " + isArmstrong(given));

        fetch.close();
    }   
}
