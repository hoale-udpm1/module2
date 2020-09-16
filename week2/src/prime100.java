import java.util.Scanner;

public class prime100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert limit");
        int limit = scanner.nextInt();
        int number = 2;
        while (number <= limit){
            if (isPrime(number)){
                System.out.print(number+" ");
            }
            number++;
        }
    }
    static boolean isPrime (int number){
        for (int i = 2; i <= Math.sqrt(number);i++){
           if (number % i == 0)
               return false;
        }
        return true;
    }
}
