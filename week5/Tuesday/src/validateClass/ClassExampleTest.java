package validateClass;

public class ClassExampleTest {
    public static ClassExample classExample;

    public static final String[] validClass = new String[]{"C0318G"};
    public static final String[] invalidClass = new String[]{"M0318G","P0323A"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String myClass : validClass){
            boolean isvalid = classExample.validate(myClass);
            System.out.println("Class is " + myClass + " is valid: " + isvalid);
        }for (String myClass : invalidClass){
            boolean isvalid = classExample.validate(myClass);
            System.out.println("Class is " + myClass + "is valid: " + isvalid);
        }

    }
}
