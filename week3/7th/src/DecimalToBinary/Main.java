package DecimalToBinary;

public class Main {
    public static void main(String[] args) {
        int decimalNumber = 123456789;
        System.out.print("Hệ nhị phân của " + decimalNumber + "là: ");
        new DecimalToBinaryExample().convertBinary(decimalNumber);
    }
}
