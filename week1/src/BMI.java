import java.util.EventListener;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("You weight (in kilogram):");
        weight = scanner.nextDouble();
        System.out.print("You height (in meter):");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20%s","bmi","Interpretation\n");
        if (bmi < 18)
            System.out.printf("%-20.2f%s",bmi,"Underweight");
        else if (bmi <25.0)
            System.out.printf("%-20.2f%s",bmi,"Normal");
        else if (bmi <30.0)
            System.out.printf("%-20.2f%s",bmi,"Overwight");
        else
            System.out.printf("%-20.2f%s",bmi,"Obese");
    }
}
