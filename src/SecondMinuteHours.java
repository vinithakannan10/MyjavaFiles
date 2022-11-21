import java.util.Scanner;

public class SecondMinuteHours {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("input seconds:");
        int Seconds = v.nextInt();
        int Sec = Seconds%60;
        int Hour = Seconds/60;
        int Min = Hour%60;
        Hour = Hour/Min;
        System.out.println(Hour+" :"+Min+":"+Sec+":");
    }
}
