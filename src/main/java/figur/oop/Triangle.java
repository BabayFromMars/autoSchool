package figur.oop;

public class Triangle extends Figures {
    public Triangle(String name, Double coordinates) {
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
Double striangle = ((getcoordinates()*getcoordinates()) * Math.sqrt(3)) / 4;
return striangle;
    }
}
