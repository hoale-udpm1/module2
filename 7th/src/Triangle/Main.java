package Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        System.out.println(triangle.f());
        System.out.println(triangle.toString());
        triangle= new Triangle(5.0,5.0,5.0);
        System.out.println(triangle.toString());
    }
}
