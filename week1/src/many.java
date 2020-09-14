import java.util.Scanner;

public class many {
    public static void main(String[] args) {
        double money = 1.0;
        int month =1;
        double interset_rate = 1.0;
        Scanner input= new Scanner(System.in);
        System.out.println("Nhap so tien gui: ");
        money = input.nextDouble();
        System.out.println("Nhap so thang gui: ");
        month = input.nextInt();
        System.out.println("Nhap lai suat: ");
        interset_rate = input.nextDouble();
        double total_interset = 0;
        for (int i = 0; i < month; i++){
            total_interset += money * (interset_rate/100)/12 * month;

        }
        System.out.println("Total of interset: " + total_interset);
    }
}
