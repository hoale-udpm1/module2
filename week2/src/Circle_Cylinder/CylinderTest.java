package Circle_Cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);

        Cylinder cylinder2 = new Cylinder(4);
        System.out.println(cylinder2);

        Cylinder cylinder3 = new Cylinder (3.2,"Grey",2.3);
        System.out.println(cylinder3);
    }
}
