import java.util.Scanner;

// Phương trình bậc nhất
public class first_degree_equation {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equaton á 'a * x + b = 0',please enter constants");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();
        if (a != 0){
            double solution = -b / a;
            System.out.println("The solutinon is: %f!" + solution);
        }
        if (a != 0){
           double answer = (c - b) / a;
            System.out.println("Equation pass with x = %f!\n" + answer);
        }else {
            if (b == 0){
                System.out.println("The solution is all x!");
            }else {
                System.out.println("No solution!");
            }
        }
    }
}
