import java.util.Scanner;

public class ToCheckPalindrome {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("enter the number to check:");
        int number = v.nextInt();
        int original = number;
        int check = 0;
        int temp = 0;
        while (number > 0) {
            temp = number % 10;
            check = (check * 10) + temp;
            number = number / 10;
        }
        if (original == check)
            System.out.println("It is a palindrome");
           else
            System.out.println("It is not a palindrome");
        }
    }




