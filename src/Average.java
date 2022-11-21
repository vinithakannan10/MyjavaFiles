import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner M = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = M.nextInt();
        System.out.println("enter the second number");
        int num2 = M.nextInt();
        System.out.println("enter the third number");
        int num3 = M.nextInt();
        System.out.println("enter the fourth number");
        int num4 = M.nextInt();
        System.out.println("enter the fifth number");
        int num5 = M.nextInt();
        System.out.println("Average number of 5 numbers:"+(num1+num2+num3+num4+num5) / 5) ;
    }
}
