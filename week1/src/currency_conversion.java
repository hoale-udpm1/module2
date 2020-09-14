import java.util.Scanner;

public class currency_conversion {
    public static void main(String[] args) {
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền USD cần chuyển:");
        double vnd = 23000;
        usd = scanner.nextDouble();
        double Thanhtien= usd * vnd;
        System.out.print("Giá trị thành tiền là: " + Thanhtien);
    }
}
