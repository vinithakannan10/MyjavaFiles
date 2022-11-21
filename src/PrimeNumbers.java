public class PrimeNumbers {
    public static void main(String[] args) {
        int w,n,count;
        System.out.println("enter the value of 1 to 100 prime numbers are:");
        for ( w = 2; w<= 100; w++) {
            count = 0;
            for (n = 1; n <= w; n++) {
                if (w % n==0) {
                    count++;
                }
            }
            if (count==2)
            System.out.println(w+"");
        }
    }
}
