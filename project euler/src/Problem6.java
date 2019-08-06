public class Problem6 {
    public static void main(String[] args) {
        int n = 100;
        int sumOfSquare = 0;
        int sum = 0;
        for (int i=1;i<=n;i++)
        {
            sumOfSquare += (int) Math.pow(i,2);
            sum += i;
        }
        int difference = (int) Math.pow(sum,2)- sumOfSquare;
        System.out.println(difference);
    }
}
