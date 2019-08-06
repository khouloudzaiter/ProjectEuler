public class Problem5 {

    public static void main(String[] args) {
        int max = 20;
        int n = (int) (Math.pow(max,2) -1);
        boolean smallestNumberEvenDivisible = false;
        //int i = 2;

       while( !smallestNumberEvenDivisible ){
           n++;
           int i = 2;
           boolean allDivisible = true;
                while ( i<=max && allDivisible){
                    allDivisible = n%i ==0;
                    i++;
                }
           smallestNumberEvenDivisible = allDivisible;
        }
        System.out.println(n);
    }
}
