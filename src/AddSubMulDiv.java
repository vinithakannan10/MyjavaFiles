import java.util.Scanner;

public class AddSubMulDiv {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("enter the a value");
        int a = n.nextInt();
        System.out.println("enter the b value");
        int b = n.nextInt();

        int c= a+b;
        System.out.println("Addition:"+c);


        int d = a-b;
        System.out.println("Subtract:"+d);

        int e = a*b;
        System.out.println("Multiply:"+e);

        int f = a/b;
        System.out.println("Divide:"+f);

        float g = a/b;
        System.out.println("Quo:"+g);

        int h = a%b;
        System.out.println("Rem:"+h);

        int i = a%b;
        System.out.println("mod:"+i);



    }
}
