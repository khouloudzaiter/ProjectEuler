import java.util.Scanner;

public class LargestPrimeFactorV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter i Value:  ");
        long n = in.nextLong();
        long number = n;
        long largestPrimeFactor = n;
        long i = 2;
        while (i <= n && n != 1) {
            if (n % i == 0) {
                n = n / i;
                largestPrimeFactor = i;
            }
            else {
                i = i+1;
            }
        }
        System.out.println("The largest prime factor of the number "+ number + " is = "+ largestPrimeFactor);
    }
}
