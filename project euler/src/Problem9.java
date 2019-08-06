public class Problem9 {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 1000 - a - b;
        boolean isPythagorean = false;

        while (!isPythagorean){
            a++;
            b = a;
            while (!isPythagorean && a+b <=1000 && b < c ) {
                b++;
                c = 1000 - a - b;
                isPythagorean = Math.pow(a,2)+ Math.pow(b,2) == Math.pow(c,2) && b < c ;
            }
        }
        System.out.println("the Pythagorean triplet for which a + b + c = 1000 Are : "+a+" , "+b+" , "+c);
        System.out.println("the product of abc is : "+a*b*c);

    }
}
