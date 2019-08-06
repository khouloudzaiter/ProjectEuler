public class Problem10 {

    protected static boolean isPrime(long n) {
        boolean prime = true;
         if (n == 2){
            prime = true;
        }
        else {
            long i = 2;
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
        int max = 2000000;
        long sumPrimes = 0;
        int occ =0;
        for (int i=2;i<=max;i++){
            if (isPrime(i)){
                sumPrimes += i;
                occ++;
                //System.out.println(i);
            }

        }
        System.out.println(sumPrimes);
    }
}
