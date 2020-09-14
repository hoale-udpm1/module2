import java.util.Scanner;

public class greatest_common_divisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        int b = scanner.nextInt();
        System.out.println("UCLN của " + a + " Và " + b + " là " + UCLN(a,b));
        System.out.println("BCNN của " + a + " Và " + b + " là " + BCNN(a,b));
    }
    public static int UCLN (int a, int b){
        if (b == 0) return a;
        return UCLN(b,a % b);
    }
    public static int BCNN(int a, int b){
        return ( a * b) / UCLN(a,b);
    }
}
