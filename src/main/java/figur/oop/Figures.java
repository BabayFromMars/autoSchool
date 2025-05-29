package figur.oop;


public abstract class Figures {
    private String name;
    private Double coordinates;

    public Figures(String name, Double coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public Double getcoordinates() {
        return coordinates;
    }

    abstract public Double areacalculation();
}
