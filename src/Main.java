import java.util.Scanner;

public class Main {
    static int sumUntilN(int n){
        // the formula of the sum of the numbers until n(included).
        return (n * (n + 1)) / 2;
    }
    static int sumSquare(int n){
        // the formula of the square of the sum of the numbers until n(included).
        return (n * (n+1) * ((2 * n) + 1)) / 6;
    }
    static int sumDifference(int n){
        int result;
        result = sumSquare(n) - sumUntilN(n);
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the value of n : ");
        int n = input.nextInt();
        while(n < 0){
            System.out.println("Please make sure the number is bigger than zero !");
            n = input.nextInt();
        }
        System.out.print("The sum of numbers until n is : " + sumUntilN(n) + "\n" + "The square of this sum is : " + sumSquare(n) + "\n"
                + "The difference between the sum square and the sum is : " + sumDifference(n));



    }
}