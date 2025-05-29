package figur.oop;

public class Circle extends Figures {

    public Circle(String name, Double coordinates) {
        super(name, coordinates);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Double getcoordinates() {
        return super.getcoordinates();
    }

    public Double areacalculation() {
        Double scircle = Math.PI * (getcoordinates()*getcoordinates());
        return scircle;
    }
}
