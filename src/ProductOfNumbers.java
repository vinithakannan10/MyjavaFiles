import java.util.Scanner;

public class ProductOfNumbers {
    public  static void main(String[] args){
        Scanner k = new Scanner(System.in);
        System.out.println("first number");
        int number1 = k.nextInt();
        System.out.println("second number");
        int number2 = k.nextInt();
        System.out.println("first number:"+number1);
        System.out.println("second number:"+number2);
        System.out.println("product:"+number1*number2);
    }
}
