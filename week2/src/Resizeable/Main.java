package Resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(2.3);
        shapes[1] = new Rectangle(3.3,3.6);
        shapes[2] = new Square(4.5);
        shapes[3] = new Square(8.8);
        for (Shape shape : shapes){
            if (shape instanceof Colorable)
                ((Colorable) shape).howToColor();
            else
                System.out.println("Area of " + shape + " is " + shape.getClass());
        }
    }
}
