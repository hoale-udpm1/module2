package interface_Resizeable;

public class Main {
    public static void main(String[] args) {
       Shape[] shapes= new Shape[3];
       shapes[0]= new Circle();
       shapes[1]= new Rectangle();
       shapes[2]= new Square();
        for (Shape shape:shapes){
            System.out.println("Before resize: "+shape);
        }
        double randomPercent = Math.round(Math.random()*100);
        System.out.println("Resize percent: " + randomPercent + "%");
        for (Shape shape:shapes){
            shape.Resize(randomPercent);
            System.out.println("After resize: " + shape);
        }
    }
}
