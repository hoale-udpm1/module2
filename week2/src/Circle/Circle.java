package Circle;

public class Circle {
    private static final double PI=3.14;
    private double radius = 1.0;
    private String color = "red";
    Circle(){
    }
    Circle(double radius){
        this.radius = radius;
    }
    double getRadius(){
        return radius;
    }
    double getArea(){
        return PI*Math.pow(getRadius(),2);
    }
}
