package car;

public class car {
    private final String name;
    private final String engine;
    public static int numberOfCars;
    public car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}
