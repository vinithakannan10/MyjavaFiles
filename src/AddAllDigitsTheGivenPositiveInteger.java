public class AddAllDigitsTheGivenPositiveInteger {
    public static void main(String[] args) {
        int number = 593;
        int sum = 0;
        while(number>0) {
            int temp = number % 10;
            sum = sum + temp;
            number = number / 10;
        }
            System.out.println("sum of the digits:"+sum);
        }}
