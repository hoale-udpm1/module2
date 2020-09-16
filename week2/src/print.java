import java.util.Scanner;

public class print {
    public static void main(String[] args) {
        int choice;
        choice = -1;
        while (choice != 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("menu");
            System.out.println("1. Print the rectangle.rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triagle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle.rectangle");
                    String str = "";
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            str += "*";
                        }
                        str += "\n";
                    }
                    System.out.println(str);
                    break;
                case 2:
                    System.out.println(" Print the square triangle");
                    String tri = "";
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            tri += "*";
                        }
                        tri += "\n";
                    }
                    for (int i = 5; i > 0; i--) {
                        for (int j = i; j > 0; j--) {
                            tri += "*";
                        }
                        tri += "\n";
                    }
                    System.out.println(tri);
                    break;
                case 3:
                    System.out.println("Print isosceles triagle");
                    String iso = "";
                    for (int i = 0; i < 7; i++) {
                        for (int j = 7 - i; j >= 0; j--) {
                            iso += " ";
                        }
                        for (int k = 14 - 2 * i; k <= 14; k++) {
                            iso += "*";
                        }
                        iso += "\n";
                    }
                    System.out.printf(iso);
                    break;
                case 0:
                    System.out.println("Exit");
                    break;

            }
        }
    }
}
