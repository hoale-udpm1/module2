package Circle;

public class Main {
    public static void main(String[] args) {
    Circle circle1 = new Circle();
        System.out.println("Default circle radius: "+circle1.getRadius());
        System.out.println("Default circle area: "+circle1.getArea());
        Circle circle2 = new Circle(4.5);
        System.out.println("Input circle area: "+ circle2.getArea());
    }
}
