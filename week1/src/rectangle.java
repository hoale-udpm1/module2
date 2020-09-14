// Nhập giá trị 2 cạnh hcn ròi tính diện tích
import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        float widht;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        widht = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float area = widht * height;
        System.out.println("diện tích hcn là: " + area);
    }
}
