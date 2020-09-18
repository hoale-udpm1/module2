package Circle_Cylinder;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle(8.1);
        System.out.println(circle2);

        Circle circle3 = new Circle(4.5,"Pink");
        System.out.println(circle3);
    }
}
