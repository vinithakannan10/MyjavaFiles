import java.util.Scanner;
public class SquareRootOfInteger {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            Double squareRoot = Math.pow(num, 0.5);
            System.out.println("The Square Root of the Given Number  " + num + "  =  " + squareRoot);

        }
    }



