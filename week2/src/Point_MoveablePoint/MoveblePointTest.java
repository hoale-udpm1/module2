package Point_MoveablePoint;

public class MoveblePointTest {
    public static void main(String[] args) {
        MoveblePoint movablePoint1 = new MoveblePoint();
        System.out.println(movablePoint1);

        MoveblePoint movablePoint2 = new MoveblePoint(25.8f,15.6f);
        System.out.println(movablePoint2);

        MoveblePoint movablePoint3 = new MoveblePoint(10f,20f,15.2f,10.5f);
        System.out.println(movablePoint3);

        System.out.println(movablePoint3.move());
    }
}
