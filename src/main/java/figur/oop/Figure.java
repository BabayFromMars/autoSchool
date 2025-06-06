package figur.oop;


public abstract class Figure {
    private String name;
    private Double coordinateX;
    private Double coordinateY;


    public Figure(String name, Double coordinateX, Double coordinateY) {
        this.name = name;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public String getName() {
        return name;
    }

    public Double getCoordinateX() {
        return coordinateX;
    }
    public Double getCoordinateY() {
        return coordinateY;
    }

    abstract public Double getAreaCalculation();
}
