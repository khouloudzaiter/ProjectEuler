public class Problem7 {
    protected static boolean isPrime(long n) {
        boolean prime = true;
        long i = 2;
        if (n == 2){
            prime = true;
        }
        else {
            while (prime && i <= Math.sqrt(n) + 1) {
                if (n % i == 0) {
                    prime = false;
                }
                i = i + 1;
            }
        }
        //System.out.println("Prime testing for the number "+n+" is done");
        return prime;
    }

    public static void main(String[] args) {
        int n = 10001;
        int primeNumber = 1;
        int i = 0;
        while (i<n) {
            primeNumber++;
            if (isPrime(primeNumber)){
                System.out.println(primeNumber);
                i++;
                System.out.println( i+"th is: "+primeNumber);
            }
        }
        System.out.println(primeNumber);
        System.out.println(n);
    }
}
