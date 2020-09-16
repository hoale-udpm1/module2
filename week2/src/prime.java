import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhap n = ");
//        int n = scanner.nextInt();
//        System.out.printf("%d số nguyên tố đầu tiên là: \n",n);
//        int dem = 0;//đếm số số nguyên tố
//        int i = 2; // tìm số nguyên tố bắt đầu từ 2
//        while (dem < n){
//            if (isPrimeNumber(i)){
//                System.out.print(i + " ");
//                dem ++;
//            }
//            i++;
//        }
//    }
//    public static boolean isPrimeNumber(int n) {
//        // so nguyen n < 2 khong phai la so nguyen to
//        if (n < 2) {
//            return false;
//        }
//        // check so nguyen to khi n >= 2
//        int squareRoot = (int) Math.sqrt(n);
//        for (int i = 2; i <= squareRoot; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number < 2)
            System.out.println("Not a prime number");
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println("Prime number");
            else
                System.out.println("Not a prime number");
        }
    }
}

