package figur.oop;


public abstract class Figure {
    private final String name;
    private final Double coordinateX;
    private final Double coordinateY;


    public Figure(String name, Double coordinateX, Double coordinateY) {
        this.name = name;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public String getName() {
        return name;
    }

    abstract public Double getAreaCalculation();

    @Override
    public String toString() {
        return "Figure{" +
                "name='" + name + '\'' +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY + ", S: " +
                getAreaCalculation() +
                '}';
    }
}
