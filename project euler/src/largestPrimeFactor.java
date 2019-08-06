import java.util.Scanner;
public class largestPrimeFactor {
    protected static boolean isPrime(long n) {
        boolean prime = true;
        long i = 2;
        while (prime && i <= n/2)
            {
                if (n%i == 0) {
                    prime = false;
                }
                i=i+1;
            }
        System.out.println("Prime testing for the number "+n+" is done");
        return prime;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter i Value:  ");
        long n = in.nextLong();
        long largestPrimeFactor = n;
        System.out.println(largestPrimeFactor);
        int m = 9;
        for (long i = 2; i <= (long) Math.sqrt(n)+1; i++) {

            if(n%i == 0){
                System.out.println("this number is divisible by "+ i);
                if (isPrime(i)) {
                    largestPrimeFactor = i;
                    System.out.println(largestPrimeFactor);
                }
            }
            if (i > Math.pow(10, m))
            {
                m = m+1;
                System.out.println("algo is in the phase" + Math.pow(10, m));
            }

        }
        System.out.println("largestPrimeFactor is = "+ largestPrimeFactor);
    }
}
