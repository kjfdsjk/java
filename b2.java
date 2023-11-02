import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner x= new Scanner(System.in);
        System.out.println("Nhập USD");
        usd= x.nextDouble();
        double a = usd * 23000;
        System.out.println(a);
    }
}
