package figur.oop;

public class Square extends Figures {

    public Square(String name, Double coordinates) {
        super(name, coordinates);
    }

    @Override
    public Double getcoordinates() {
        return super.getcoordinates();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Double areacalculation() {
      Double ssquare = getcoordinates() * getcoordinates();
        return ssquare;
    }
}
